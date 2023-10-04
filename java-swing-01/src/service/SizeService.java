package service;

import utils.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entity.Size;

public class SizeService {

    public List<Size> getAll() {
        String sql = " SELECT MaSize ,Size ,TrangThai FROM Size ";
        try (Connection con = DBConnect.getConnection("S1_Nhom1"); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            List<Size> list = new ArrayList<>();
            while (rs.next()) {
                Size sz = new Size();
                sz.setMaSize(rs.getString(1));
                sz.setSize(rs.getString(2));
                sz.setTrangThai(rs.getBoolean(3));
                list.add(sz);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public boolean add(Size sz) {
//        int check = 0;
//        String sql = """
//                     INSERT INTO [dbo].[Size]
//                                ([MaSize]
//                                ,[Size]
//                                ,[TrangThai])
//                          VALUES
//                                (?,?,?)
//                     """;
//        try (Connection con = DBConnect.getConnection("S1_Nhom1"); PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, sz.getMaSize());
//            ps.setObject(2, sz.getSize());
//            ps.setObject(3, sz.isTrangThai());
//            check = ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return check > 0;
//    }
//
//    public String update(Size sz, String maCu) {
//        String sql = """
//                     UPDATE [dbo].[Size]
//                        SET [MaSize] = <MaSize, nvarchar(10),>
//                           ,[Size] = <Size, nvarchar(5),>
//                           ,[TrangThai] = <TrangThai, bit,>
//                      WHERE ma = ?
//                     """;
//        try (Connection con = DBConnect.getConnection("S1_Nhom1"); PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, sz.getMaSize());
//            ps.setObject(2, sz.getSize());
//            ps.setObject(3, sz.isTrangThai());
//            ps.setObject(4, maCu);
//            if (ps.executeUpdate() > 0) {
//                return "Update thanh cong";
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return "Update khong thanh cong";
//    }
//
//    public boolean delete(String ma) {
//        int check = 0;
//        String sql = """
//                     DELETE FROM [dbo].[Size]
//                           WHERE MaSize = ?
//                     """;
//        try (Connection con = DBConnect.getConnection("S1_Nhom1"); PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, ma);
//            check = ps.executeUpdate();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return check > 0;
//    }

//    public List<Size> search(String ma) {
////        List<Size> listsearch = new ArrayList<>();
////        for (Size sz : getAll()) {
////            if (sz.getMaSize().contains(ma)) {
////                listsearch.add(sz);
////            }
////        }
//        List<Size> list = new ArrayList<>();
//        String sql = "Select * FROM  Size WHere MaSize = ? OR TrangThai= ?";
//        try (Connection con = DBConnect.getConnection("S1_Nhom1"); PreparedStatement ps = con.prepareStatement(sql)) {
//            ps.setObject(1, ma);
//            ps.setObject(2, ma);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Size sz = new Size();
//                sz.setMaSize(rs.getString(1));
//                sz.setSize(rs.getString(2));
//                sz.setTrangThai(rs.getBoolean(3));
//                list.add(sz);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//
//    public static void main(String[] args) {
//        List<Size> list = new SizeService().getAll();
//        System.out.println(list);
//    }
}
