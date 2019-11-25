/*Bao quát Dịch Vụ*/
create table dichvu 
(
ID_dichvu	int  auto_increment primary key,
TenDichVu varchar(45) not null,
DienTich int not null,
SoTang int,
SoNguoiToiDa int,
ChiPhiThue double,
IDKieuThue int,
IDLoaiDichVu int,
foreign key(IDLoaiDichVu) references loaidichvu(IDLoaiDichVu),
foreign key(IDKieuThue) references kieuthue(IDKieuThue)
);
CREATE TABLE loaidichvu 
(
IDLoaiDichVu int  auto_increment primary key,
TenLoaiDichVu varchar(45) not null
);
create table kieuthue
(
IDKieuThue int  auto_increment primary key,
TenKieuThue varchar(45) not null,
Gia int not null
);
/* Bao quát khách hàng*/
create table loaikhach 
(
IDLoaiKhach int  auto_increment primary key,
TenLoaiKhach varchar(45)
);
create table khachhang
(
IDKhachHang int  auto_increment primary key,
IDLoaiKhach int,
HoTen varchar(45),
NgaySinh date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key(IDLoaiKhach) references loaikhach(IDLoaiKhach)
);
/* Bao quát nhân viên*/
create table vitri
(
IDViTri int  auto_increment primary key,
TenViTri varchar(45)
);
create table trinhdo
(
IDTrinhDo int  auto_increment primary key,
TrinhDo varchar(45)
);
create table bophan
(
IDBoPhan int  auto_increment primary key,
TenBoPhan varchar(45)
);
create table nhanvien
(
IDNhanVien int  auto_increment primary key,
HoTen varchar(45),
IDViTri int,
IDTrinhDo int,
IDBoPhan int,
NgaySinh date,
SoCMND varchar(45),
SDT varchar(45),
Email varchar(45),
DiaChi varchar(45),
foreign key(IDVitri) references vitri(IDViTri),
foreign key(IDTrinhDo) references trinhdo(IDTrinhDo),
foreign key(IDBoPhan) references bophan(IDBoPhan)
);
/* Bao quát Hợp đồng chi tiết*/
create table dichvudikem
(
IDDichVuDiKem int  auto_increment primary key,
TenDichVuDiKem varchar(45),
Gia int,
DonVi varchar(45),
TrangThaiKhaDung varchar(45)
);
create table hopdongchitiet
(
IDHopDongChiTiet int  auto_increment primary key,
IDHopDong int,
IDDichVuDiKem int,
SoLuong int,
foreign key(IDHopDong) references hopdong(IDHopDong),
foreign key(IDDichVuDiKem) references dichvudikem(IDDichVuDiKem)
);
/* Bao quát tổng của --> Hợp đồng */
create table hopdong
(
IDHopDong int  auto_increment primary key,
IDNhanVien int,
IDKhachHang int,
ID_DichVu int,
NgayLamHopDong date,
NgayKetThuc date,
TienDatCoc int,
TongTien int,
foreign key(IDNhanVien) references nhanvien(IDNhanVien),
foreign key(IDKhachHang) references khachhang(IDKhachHang),
foreign key(ID_DichVu) references dichvu(ID_DichVu)
);
 