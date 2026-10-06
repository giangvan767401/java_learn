// mang luu cac gia tri lien quan voi nhau
// mang la kieu du lieu tham chieu
/* 
Uu diem: 
    Toi Uu code
    Co the truy cap ngau nhien bang chi so cac phan tu
    De thao tac, quan ly

Nhuoc diem:
    Khong the thay doi kich thuoc mang
    Vung luu tru phai lien tiep: cac o nho lien tiep nen phaii ton khong gian
    bo nho hoac du o nho, nhung cac o nho kh lien tiep nen khong khai bao duoc.
*/

public class b10_mang {
    public static void main(String[] args) {
        int a[];
        a = new int[3];
        a[0] = 1;
        a[1] = 3;
        a[2] = 5;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        char[] b = { 'a', 'b', 'c' };
        System.out.println(b);
    }
}
