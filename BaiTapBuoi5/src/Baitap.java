import java.util.Scanner;

public class Baitap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, tong = 0, dem = 0, soChan = 0 , cache =0;
		
		System.out.println("Nhập số lượng phần tử của mảng : ");
		n = Integer.parseInt(scan.nextLine());
		
		int [] mang = new int [n];
		int numberOne = mang[0];
		int viTri1 = 0,viTri2 = 0;
		System.out.println("Mời bạn nhập các phần tử của mảng, mảng của bạn có " +n+" phần tử !");
		// nhập vào các phần tử của mảng
		for(int i = 0; i < mang.length ; i++) {
			System.out.println("Mời bạn nhập số thứ " + (i +1) + ":");
			mang [i] = Integer.parseInt(scan.nextLine());
		}
		//1 tính tổng các số dương trong mảng
		for ( int i = 0 ; i < mang.length ; i++ ) {
			if(mang[i] > 0) {
				tong += mang[i];
				dem++;
			}	
		}
		System.out.println("Tổng của các số dương trong mảng là  :" + tong );
		//2 đếm có bao nhiêu số dương trong mảng 
		System.out.println("Số số dương trong mảng là :" + dem);
		
		//3 Tìm số nhỏ nhất trong mảng 
		for ( int i = 0; i < mang.length ; i++) {
			if(mang[numberOne] > mang[i]) {
				numberOne = i;
			}
		}
		System.out.println("Số nhỏ nhất trong mảng là  : " + mang[numberOne] );
		// 4 Số dương nhỏ nhất trong mảng
		for ( int i = 0 ; i < mang.length ; i++ ) {
				if( mang[i] > 0 ) {
					numberOne = i ; 
					break;
				}
		}
		for ( int i = 0; i  < mang.length ; i++  ) {
			if( mang[i]>0 && mang[numberOne] > mang[i] ) {
				numberOne = i;
			}
		}
		System.out.println("Số dương nhỏ nhất trong mảng là : " + mang[numberOne] );
		
		// 5 Tìm số chẵn cuối cùng trong mảng, nếu mảng không có giá trị chẵn thì trả về -1
		dem = 0;
		for( int i = 0 ; i < mang.length ; i++) {
			if (mang[i] % 2 == 0 ) {
				soChan = mang[i];
				dem++;
			}
		}
		if(dem == 0 ) {
			System.out.println("Mảng không có số chẵn nào : -1 " );
		}
		else {
		System.out.println("Số chẵn cuối cùng trong mảng là  : " + soChan);
		}
		//6 Đổi chỗ 2 gí trị trong mảng theo vị trí ( cho nhập vào 2 vị trí muốn đổi chỗ của giá trị
		System.out.println("Nhập vào 2 giá 2 vị trí muốn đổi chỗ giá trị trong mảng, Vị trí 1 : ");
		viTri1 = Integer.parseInt(scan.nextLine());
		while( viTri1 >= n || viTri1 <= -1  ) {
			System.out.println("Vui lòng nhập lại vị trí 1 phải lớn hơn -1 và nhỏ hơn " +n);
			viTri1 = Integer.parseInt(scan.nextLine());
		}
		System.out.println("Vị trí 2 : ");
		viTri2 = Integer.parseInt(scan.nextLine());
		while( viTri2 >= n || viTri2 <= -1  ) {
			System.out.println("Vui lòng nhập lại vị trí 1 phải lớn hơn -1 và nhỏ hơn " +n);
			viTri2 = Integer.parseInt(scan.nextLine());
		}
		cache = mang[viTri1];
		mang[viTri1] = mang[viTri2];
		mang[viTri2] = cache;
		System.out.println("mang 1 " + mang[viTri1]);
		System.out.println("mang 2 " + mang[viTri2]);
	}
	
	public static void InRaMenu() {
		System.out.println("1. Tổng các số dương  trong mảng. ");
		System.out.println("2. Đếm có bao nhiêu số dương trong mảng. ");
		System.out.println("3. Tìm số nhỏ nhất trong mảng. ");
		System.out.println("4. Tìm số dương nhỏ nhất trong mảng. ");
		System.out.println("5. Tìm số chẵn cuối cùng trong mảng. Nếu mảng không có giá trị chẵn thì trả về -1. ");
		System.out.println("6. Đổi chỗ 2 giá trị trong mảng theo vị trí (Cho nhập vào 2 vị trí muốn đổi chỗ giá trị). ");
		System.out.println("7. Sắp xếp mảng theo thứ tự tăng dần");
		System.out.println("8 . Tìm số nguyên tố đầu tiên trong mảng. Nếu mảng không có số nguyên tố thì trả về – 1 ");
		System.out.println("9. Nhập thêm 1 mảng số thực, tìm xem trong mảng có bao nhiêu số nguyên? ");
		
	}
}
