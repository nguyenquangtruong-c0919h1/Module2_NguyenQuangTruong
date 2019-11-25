/* Yêu Cầu 2*/
select*from nhanvien
where (HoTen like "h%" or HoTen like "k%" or HoTen like "t%") and length(HoTen)<=20;
/* Yêu Cầu 3*/
select*from khachhang
where ((curdate()-khachhang.NgaySinh)>=(18*30*365) and (curdate()- khachhang.NgaySinh)<=(50*30*365))  and (DiaChi="Đà Nẵng" or DiaChi="Quảng Trị");
/*Yêu Cầu 4*/
select khachhang.HoTen, count(hopdong.IDHopDong) as SoLanDatPhong from khachhang inner join hopdong on khachhang.IDKhachHang=hopdong.IDKhachHang
inner join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
where LoaiKhach.TenLoaiKhach="Dinamond"; 
/* Yêu Cầu 5*/
select khachhang.IDKhachHang, khachhang.HoTen, loaikhach.TenLoaiKhach, hopdong.IDHopDong, dichvu.TenDichVu, hopdong.NgayLamHopDong, hopdong.NgayKetThuc, 
sum(dichvu.ChiPhiThue+(hopdongchitiet.SoLuong*dichvudikem.Gia)) as TongTien from khachhang
left join loaikhach on khachhang.IDLoaiKhach=loaikhach.IDLoaiKhach
left join hopdong on hopdong.IDKhachHang=khachhang.IDKhachHang
left join dichvu on hopdong.ID_dichvu = dichvu.ID_dichvu
left join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
left join dichvudikem on hopdongchitiet.IDDichVuDiKem=dichvudikem.IDDichVuDiKem
group by khachhang.IDKhachHang;
/*Yeu cau 6*/
select dichvu.ID_dichvu, dichvu.TenDichVu, dichvu.DienTich, dichvu.SoNguoiToiDa, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu from dichvu
inner join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
where not exists(select hopdong.IDHopDong from hopdong where (hopdong.NgayLamHopDong between "2019-01-01" and "2019-03-31") and hopdong.ID_dichvu=dichvu.ID_dichvu);
/*YeuCau 7*/
select dichvu.ID_dichvu, dichvu.TenDichVu, dichvu.DienTich, dichvu.SoNguoiToiDa, dichvu.ChiPhiThue, loaidichvu.TenLoaiDichVu from dichvu
inner join loaidichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
where exists(select hopdong.IDHopDong from hopdong where year(hopdong.NgayLamHopDong)="2018" and hopdong.ID_DichVu=dichvu.ID_dichvu)
and not exists(select hopdong.IDHopDong from hopdong where year(hopdong.NgayLamHopDong)="2019" and hopdong.ID_DichVu=dichvu.ID_dichvu);
/*YeuCau 8*/
/*Cach 1*/
select distinct khachhang.HoTen from khachhang;
/*Cach 2*/
select distinctrow khachhang.HoTen from khachhang;
/*Cach 3*/ 
select khachhang.HoTen from khachhang union all select khachhang.HoTen from khachhang;
/* Yeu Cau 9*/
select bangphu.month, count(month(hopdong.NgayLamHopDong)) as sokhachhangdangky, sum(hopdong.TongTien) as tongtien from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as bangphu
left join hopdong on month(hopdong.NgayLamHopDong)=bangphu.month
left join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
where year(hopdong.NgayLamHopDong)="2019" or year(hopdong.NgayLamHopDong) is null or month(hopdong.NgayLamHopDong) is null
group by bangphu.month
order by bangphu.month;
/*Yeu Cau 10*/
select hopdong.IDHopDong, hopdong.NgayLamHopDong, hopdong.NgayKetThuc, hopdong.TienDatCoc, count(hopdongchitiet.IDDichVuDiKem) as soluongdichvudikem
from hopdong
inner join hopdongchitiet on hopdong.IDHopDong=hopdongchitiet.IDHopDong
group by hopdong.IDHopDong;
/*YeuCau 11*/
select dichvudikem.TenDichVuDiKem, dichvudikem.Gia,dichvudikem.DonVi from hopdong
inner join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
inner join dichvudikem on hopdongchitiet.IDDichVuDiKem = dichvudikem.IDDichVuDiKem
inner join khachhang on khachhang.IDKhachHang = hopdong.IDKhachHang
inner join loaikhach on khachhang.IDLoaiKhach = loaikhach.IDLoaiKhach
where loaikhach.TenLoaiKhach="Diamond" and khachhang.DiaChi in ("Đà Nẵng", "Vinh");
/*Yêu Cầu 12*/
select hopdong.IDHopDong, nhanvien.HoTen, khachhang.HoTen, khachhang.SDT, dichvu.TenDichVu, count(hopdongchitiet.IDHopDongChiTiet) as SoLuongDichVuDiKem,
hopdong.TienDatCoc from hopdong
inner join nhanvien on hopdong.IDNhanVien = nhanvien.IDNhanVien
inner join khachhang on hopdong.IDKhachHang = khachhang.IDKhachHang
inner join dichvu on dichvu.ID_dichvu = hopdong.ID_dichvu
inner join hopdongchitiet on hopdong.IDHopDong = hopdongchitiet.IDHopDong
where not exists(select hopdong.IDHopDong where hopdong.NgayLamHopDong between "2019-01-01" and "2019-06-31")
and exists(select hopdong.IDHopDong where hopdong.NgayLamHopDong between "2019-10-01" and "2019-12-31");
/* Yêu Cầu 13*/
select dichvu.TenDichVu, max(dichvu.ID_dichvu) as solansudung from dichvu; 
/* Yêu cầu 14*/
select hopdong.IDHopDong, loaidichvu.TenLoaiDichVu, dichvudikem.TenDichVuDiKem, count(hopdongchitiet.IDDichVuDiKem) as solansudung
from loaidichvu 
inner join dichvu on dichvu.IDLoaiDichVu = loaidichvu.IDLoaiDichVu
inner join hopdong on hopdong.ID_dichvu = dichvu.ID_dichvu
inner join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
inner join dichvudikem on dichvudikem.IDDichVuDiKem = hopdongchitiet.IDDichVuDiKem
group by IDHopDong having count(hopdongchitiet.IDDichVuDiKem)=1;
/*Yeu Cau 15*/
select nhanvien.IDNhanVien, nhanvien.HoTen, trinhdo.TrinhDo, bophan.TenBoPhan, nhanvien.SDT, nhanvien.DiaChi, count(hopdong.IDHopDong) as hopdongtoida  from nhanvien
inner join hopdong on hopdong.IDNhanVien = nhanvien.IDNhanVien
inner join trinhdo on trinhdo.IDTrinhDo = nhanvien.IDTrinhDo
inner join bophan on bophan.IDBoPhan = nhanvien.IDBoPhan
where ( year(hopdong.NgayLamHopDong)="2018" or year(hopdong.NgayLamHopDong)="2019")
group by nhanvien.IDNhanVien having count(hopdong.IDHopDong)<=3 ;
/*Yêu cầu 16*/
select*from nhanvien;
select*from hopdong;
delete nhanvien from nhanvien inner join hopdong on hopdong.IDNhanVien = nhanvien.IDNhanVien
where year(hopdong.NgayLamHopDong) not between "2017" and "2019";
/* Yêu cầu 17*/
update khachhang
inner join hopdong on hopdong.IDKhachHang=khachhang.IDKhachHang
inner join loaikhach on loaikhach.IDLoaiKhach = khachhang.IDLoaiKhach
set khachhang.IDLoaiKhach = 1
where khachhang.IDLoaiKhach=2 and year(hopdong.NgayLamHopDong) = 2019 and hopdong.TongTien >= 10000000;
/* Yêu cầu 18*/
delete khachhang from khachhang
inner join hopdong on hopdong.IDKhachHang = khachhang.IDKhachHang
inner join hopdongchitiet on hopdongchitiet.IDHopDong = hopdong.IDHopDong
where year(hopdong.NgayLamHopDong )<2016;
