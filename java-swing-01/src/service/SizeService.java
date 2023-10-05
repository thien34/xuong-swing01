package service;

import utils.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entity.Size;
import utils.MethodService;

public class SizeService implements MethodService<Size, String> {

    String GET_ALL_SQL = "SELECT * FROM SIZE";
    String GET_FROM_TO = "SELECT * FROM SIZE ORDER BY MaSize OFFSET ? ROWS FETCH NEXT ? ROWS ONLY";
    String GET_BY_ID = "SELECT * FROM SIZE WHERE MaSize = ?";
    String INSERT_SQL = "INSERT SIZE VALUES(?,?,?)";
    String UPDATE_SQL = "UPDATE SIZE SET Size = ?, TrangThai = ? WHERE MaSize = ?";
    String DELETE_SQL = "DELETE SIZE WHERE MaSize = ?";
    String LOC = "Select * FROM  Size WHere TrangThai= ?";
    String TIM = "Select * FROM  Size WHere MaSize = ? OR Size = ?";

    @Override
    public List<Size> selectBySQL(String sql, Object... args) {
        List<Size> list = new ArrayList<>();
        try {
            ResultSet rs = DBConnect.executeQuery(sql, args);
            while (rs.next()) {
                Size size = Size.builder()
                        .maSize(rs.getString(1))
                        .size(rs.getString(2))
                        .trangThai(rs.getBoolean(3))
                        .build();
                list.add(size);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Size> getAll() {
        return selectBySQL(GET_ALL_SQL);
    }

    @Override
    public List<Size> getFromTo(int start, int end) {
        return selectBySQL(GET_FROM_TO, start, end);
    }

    @Override
    public Size getByID(String id) {
        List<Size> list = selectBySQL(GET_BY_ID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    public void add(Size o) {
        DBConnect.executeUpdate(INSERT_SQL, o.getMaSize(), o.getSize(), o.isTrangThai());
    }

    @Override
    public void update(Size o) {
        DBConnect.executeUpdate(UPDATE_SQL, o.getSize(), o.isTrangThai(), o.getMaSize());
    }

    @Override
    public void remove(String id) {
        DBConnect.executeUpdate(DELETE_SQL, id);
    }

    public List<Size> search(String ma) {
        return selectBySQL(TIM, ma, ma);
    }

    public List<Size> loc(String trangThai) {
        return selectBySQL(LOC, trangThai);
    }
}
