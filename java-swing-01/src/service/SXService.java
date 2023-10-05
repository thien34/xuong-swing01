package service;

import entity.SanXuat;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import utils.DBConnect;
import utils.MethodService;

public class SXService implements MethodService<SanXuat, String> {

    String GET_ALL_SQL = "SELECT * FROM NSX";
    String GET_FROM_TO = "SELECT * FROM NSX ORDER BY MaNSX OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
    String GET_BY_ID = "SELECT * FROM NSX WHERE MaNSX = ?";
    String INSERT_SQL = "INSERT NSX VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE NSX SET TenNSX = ?, DiaChi = ?, TrangThai = ? WHERE MaNSX = ?";
    String DELETE_SQL = "DELETE NSX WHERE MaNSX = ?";
    String LOC = "Select * FROM  NSX WHere TrangThai= ?";
    String TIM = "Select * FROM  NSX WHere MaNSX = ? OR TenNSX = ? OR DiaChi = ?";

    @Override
    public List<SanXuat> selectBySQL(String sql, Object... args) {
        List<SanXuat> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.executeQuery(sql, args);
            while (rs.next()) {
                SanXuat sanXuat = SanXuat.builder()
                        .maNSX(rs.getString(1))
                        .tenNSX(rs.getString(2))
                        .diaChi(rs.getString(3))
                        .trangThai(rs.getBoolean(4))
                        .build();
                list.add(sanXuat);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<SanXuat> getAll() {
        return selectBySQL(GET_ALL_SQL);
    }

    @Override
    public List<SanXuat> getFromTo(int start, int end) {
        return selectBySQL(GET_FROM_TO, start, end);
    }

    @Override
    public SanXuat getByID(String id) {
        List<SanXuat> list = selectBySQL(GET_BY_ID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public void add(SanXuat o) {
        DBConnect.executeUpdate(INSERT_SQL, o.getMaNSX(), o.getTenNSX(), o.getDiaChi(), o.getTrangThai());
    }

    @Override
    public void update(SanXuat o) {
        DBConnect.executeUpdate(UPDATE_SQL, o.getTenNSX(), o.getDiaChi(), o.getTrangThai(), o.getMaNSX());
    }

    @Override
    public void remove(String id) {
        DBConnect.executeUpdate(DELETE_SQL, id);
    }
    
    public List<SanXuat> search(String ma) {
        return selectBySQL(TIM, ma, ma, ma);
    }

    public List<SanXuat> loc(String trangThai) {
        return selectBySQL(LOC, trangThai);
    }

}
