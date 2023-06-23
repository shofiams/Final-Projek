//Import class yang dibutuhkan
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class penjualanbarang {
    public static void main(String args[]){

        //Inisialisasi objek untuk masing-masing kelas
        Scanner input = new Scanner(System.in);
        DecimalFormat tampilRp = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        //Deklarasi variabel
        int jmlbeli=0;
        int i=0;
        double total_bayar=0;
        
        //Deklarasi array
        int [] kodeBarang = new int[20];
        int [] jmlBarang = new int[20];
        int [] harga = new int[20];
        double [] sub_total = new double[20];
        String [] barang = new String[20];

        System.out.println("===============================================");
        System.out.println("            PPM.AL-AZHAR MUNCAR                ");
        System.out.println("        jln.Ompak Songo Tembokrejo             ");
        System.out.println("            Muncar Banyuwangi                  ");
        System.out.println("            Tlp :(0333) 593 365.               ");
        System.out.println("              AL-AZHAR MART                    ");
        System.out.println("===============================================");
        System.out.println("Kasir putri : Shofia MS                        ");
        System.out.println("Nope Kasir  : 085755392689                     "); 
        System.out.println("-----------------------------------------------");  
        
        System.out.print("Masukan Jumlah Beli : ");
        jmlbeli=input.nextInt();
        System.out.println(" ");

        //Memasukan elemen didalam array
        for (i=0; i<jmlbeli;i++) {
            System.out.print("Masukan Kode Barang Ke-"+(i+1)+" : ");
            kodeBarang[i]=input.nextInt();
            System.out.print("jumlah barang Ke-"+(i+1)+" : ");
            jmlBarang[i]=input.nextInt();

            //Menentukan barang berdasarkan kode yang dimasukkan
            switch (kodeBarang[i]){
                case 1 : 
                        barang[i]="Kaos kaki";
                        harga[i]=10000;
                        break;
                case 2 : 
                        barang[i]="Handuk tebal";
                        harga[i]=30000;
                        break;
                case 3 : 
                        barang[i]="Saos sambal";
                        harga[i]=7000;
                        break;
                case 4 : 
                        barang[i]="Kecap manis";
                        harga[i]=2000;
                        break;
                case 5 : 
                        barang[i]="Sandal jepit";
                        harga[i]=25000;
                        break;

                case 6 :  
                        barang[i]="Odol segar";
                        harga[i]=10000;
                        break;
                case 7 :  
                        barang[i]="Lays lite";
                        harga[i]=7000;
                        break;
                case 8 :  
                        barang[i]="Sari Roti";
                        harga[i]= 3000;
                        break;
                case 9 :   
                        barang[i]="fanta merah";
                        harga[i]=5000;
                        break;
                case 10 :   
                        barang[i]="Lasegar badak";
                        harga[i]=7000;
                        break;
                case 11 :   
                        barang[i]="Kopiko pres";
                        harga[i]=8000;
                        break;
                default : 
                        System.out.println("Kode Barang Tidak Tersedia");
            }
        }
        
        //Pengaturan format number
        formatRp.setCurrencySymbol("Rp. ");
        tampilRp.setDecimalFormatSymbols(formatRp);
          
        System.out.println(" ");
        System.out.println("No    Barang     \tHarga     \tjumlah     \tSub Total");  
        System.out.println("-------------------------------------------------------");  
          
        //Menampilkan seluruh elemen di dalam array
        for (i=0; i<jmlbeli;i++){ 
            sub_total[i]=((jmlBarang[i]*harga[i]));
            total_bayar+=sub_total[i];
            System.out.println(i+1+"    "+barang[i]+"   "+tampilRp.format(harga[i])+" "+jmlBarang[i]+" "+tampilRp.format(sub_total[i])); 
        }
        System.out.println(" ");
        System.out.println("-------------------------------------------------------");  
        //Menampilkan total bayar
        System.out.println("Total Bayar : "+tampilRp.format(total_bayar));

        System.out.print("Masukkan jumlah bayar :  ");
        int bayar;
        bayar = input.nextInt();
        System.out.println("Jumlah Uang tunai     :"+tampilRp.format(bayar));
        

        System.out.println("Kembalian Anda        : "+tampilRp.format(bayar - total_bayar));
        System.out.println("---------------------------------------------------");  

        System.out.println("Terimakasih telah berbelanja di toko kami ");

        System.out.println("Periksa Barang sebeleum dibeli !");
        System.out.println("Barang yang sudah dibeli tidak bisa ditukar atau dikembalikan");

    }
}