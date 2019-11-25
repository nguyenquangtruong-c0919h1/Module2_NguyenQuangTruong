/* Nhập thông tin cho Bộ Phận */
insert into bophan(TenBoPhan) value("Kế Toán - Tài Chính");
insert into bophan(TenBoPhan) value("Buồng Phòng");
insert into bophan(TenBoPhan) value("Bảo Vệ");
insert into bophan(TenBoPhan) value("Nhà Hàng");
insert into bophan(TenBoPhan) value("Nhân Sự");
/* Nhập thông tin cho Vị Trí trong Nhân Viên*/
insert into vitri(TenViTri) value("Kế Toán Trưởng");
insert into vitri(TenViTri) value("Nhân Viên Tài Chính");
insert into vitri(TenViTri) value("Trường Buồng Phòng");
insert into vitri(TenViTri) value("Nhân Viên Buồng Phòng");
insert into vitri(TenViTri) value("Bảo Vệ");
insert into vitri(TenViTri) value("Đầu bếp chính");
insert into vitri(TenViTri) value("Đầu bếp phụ");
insert into vitri(TenViTri) value("Nhân Viên Phục Vụ");
insert into vitri(TenViTri) value("Nhân viên Nhân Sự");
/* Nhập thông tin Trình độ trong Nhân Viên*/
insert into trinhdo(TrinhDo) value("Đại Học");
insert into trinhdo(TrinhDo) value("Cao Đẳng");
insert into trinhdo(TrinhDo) value("12/12");
/* Nhập Thông tin Nhân Viên*/
insert into nhanvien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,SDT,Email,DiaChi) value("Nguyễn Xuân Hướng","1","1","1","1999/2/12","2352357923","0934234234","xuanhuongqb@gmail.com","Phô hàng mơ");
insert into nhanvien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,SDT,Email,DiaChi) value("Hồ Quang Hiếu","2","2","2","1990/3/14","2345345345","094533423223","hoquanghieu@gmail.com","Phô hàng chợ");
insert into nhanvien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,SDT,Email,DiaChi) value("Trương Thế Trọng","3","3","3","2000/5/23","5756765756","093282348235","truongthetrong@gmail.com","Phô hàng chuối");
insert into nhanvien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,SDT,Email,DiaChi) value("Khổng Tú Cầu","2","2","3","1989/5/21","4574567456","235235","khongtucau@gmail.com","Phô hàng me");
insert into nhanvien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,SDT,Email,DiaChi) value("Nguyễn Như Kha","3","3","4","1994/3/22","5756757","45674376457","nguyennhukha@gmail.com","Phô hàng gốm");
insert into nhanvien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,SDT,Email,DiaChi) value("Trần Bình Trong","1","2","4","1976/3/21","435643673457","2345352","tranbinhtrong@gmail.com","Phô hàng cá");
insert into nhanvien(HoTen,IDViTri,IDTrinhDo,IDBoPhan,NgaySinh,SoCMND,SDT,Email,DiaChi) value("Nguyên Quang Trường","1","3","5","1972/11/23","45745745745","345345345","nguyenquangtruong@gmail.com","Phô hàng tôm");
/* ------------------------------------------------------*/
/* Nhập Thông Tin Loại Khách */
insert into loaikhach(TenLoaiKhach) value("Diamond");
insert into loaikhach(TenLoaiKhach) value("Platinium");
insert into loaikhach(TenLoaiKhach) value("Gold");
insert into loaikhach(TenLoaiKhach) value("Silver");
insert into loaikhach(TenLoaiKhach) value("Member");
/* Nhập Thông tin Khách Hàng*/
insert into khachhang(IDLoaiKhach,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi) value("1","Nguyễn Văn A","1999/2/12","2343253245","23423532","nguyenvana@gmail.com","Đà Nẵng");
insert into khachhang(IDLoaiKhach,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi) value("2","Nguyễn Văn B","2001/10/12","1324535234","25423524","nguyenvanb@gmail.com","Quảng Trị");
insert into khachhang(IDLoaiKhach,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi) value("3","Nguyễn Văn C","1954/1/23","234534523","13254213421","nguyenvanc@gmail.com","Quảng Bình");
insert into khachhang(IDLoaiKhach,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi) value("4","Nguyễn Văn D","1996/4/21","456457567","45745745745","nguyenvaDc@gmail.com","Quảng Nam");
insert into khachhang(IDLoaiKhach,HoTen,NgaySinh,SoCMND,SDT,Email,DiaChi) value("5","Nguyễn Văn E","1978/2/11","235464356","2342342342","nguyenvanE@gmail.com","Quảng Ngãi");
/* ------------------------------------------------------*/
/* Nhập Thông Tin Kiểu Thuê  */
insert into kieuthue(TenKieuThue,Gia) value ("Thuê Theo Tháng","10000000");
insert into kieuthue(TenKieuThue,Gia) value ("Thuê Theo Năm","120000000");
insert into kieuthue(TenKieuThue,Gia) value ("Thuê Theo Ngày","600000");
insert into kieuthue(TenKieuThue,Gia) value ("Thuê Theo Giờ","150000");
/* Nhập Loại Dịch Vụ*/
insert into loaidichvu(TenLoaiDichVu) value("Villa");
insert into loaidichvu(TenLoaiDichVu) value("House");
insert into loaidichvu(TenLoaiDichVu) value("Phòng");
/*Nhập Dịch vụ*/
insert into dichvu(TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu) value("Villa","100","10","5","1500000","1","1");
insert into dichvu(TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu) value("House","70","7","4","1000000","2","2");
insert into dichvu(TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu) value("Room","50","4","3","700000","3","3");
/*Nhập Dịch vụ đi kèm*/
insert into dichvudikem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung) value("Massage","200000","Dong","Mở");
insert into dichvudikem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung) value("Karaoke","200000","Dong","Mở");
insert into dichvudikem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung) value("Thức Ăn","150000","Dong","Mở");
insert into dichvudikem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung) value("Nước Uống","30000","Dong","Mở");
insert into dichvudikem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung) value("Xe Di Chuyển","300000","Dong","Mở");
/*Nhập Hợp đồng chi tiết*/
insert into hopdongchitiet(IDHopDong,SoLuong,IDDichVuDiKem) value("1","1","1");
insert into hopdongchitiet(IDHopDong,SoLuong,IDDichVuDiKem) value("2","2","2");
insert into hopdongchitiet(IDHopDong,SoLuong,IDDichVuDiKem) value("3","3","3");
insert into hopdongchitiet(IDHopDong,SoLuong,IDDichVuDiKem) value("3","1","5");
insert into hopdongchitiet(IDHopDong,SoLuong,IDDichVuDiKem) value("2","2","4");
/*Nhập Hợp đồng*/
insert into hopdong(IDNhanVien,IDKhachHang,ID_DichVu,NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien) value("1","1","1","2019/11/13","2019/12/13","2000000","10000000");
insert into hopdong(IDNhanVien,IDKhachHang,ID_DichVu,NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien) value("2","2","2","2019/11/20","2020/11/20","10000000","120000000");
insert into hopdong(IDNhanVien,IDKhachHang,ID_DichVu,NgayLamHopDong,NgayKetThuc,TienDatCoc,TongTien) value("3","3","3","2019/11/13","2019/11/13","120000","500000");