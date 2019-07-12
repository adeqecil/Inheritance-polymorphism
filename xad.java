import java.util.*; 
import java.util.*;
import java.lang.*;

class Regular {
    protected String codeName, name;
    protected int price;

    public Regular(){}

    public String getCodeName(){
        return this.codeName;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public void setCodeName(String value){
        this.codeName = value;
    }
    public void setName(String value){
        this.name = value;
    }
    public void setPrice(int value){
        this.price = value;
    }
}

class Special {
    protected String codeName, name;
    protected int price, discount;

    public Special(){}

    public String getCodeName(){
        return this.codeName;
    }
    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public int getDiscount(){
        return this.price;
    }
    public void setCodeName(String value){
        this.codeName = value;
    }
    public void setName(String value){
        this.name = value;
    }
    public void setPrice(int value){
        this.price = value;
    }
    public void setDiscount(int value){
        this.discount = value;
    }
}

// Driver class
public class xad {
    private static void addRegular(ArrayList<Regular> arrayList){
        Regular regular = new Regular();
        Scanner input = new Scanner(System.in);
        boolean cek;
        String regex;
        do{
            System.out.println("Masukkan codename: ");
            regex = input.nextLine();
            if(regex.matches("R\\d\\d\\d")){
                cek = true;
            }
            else{
                cek = false;
            }
            
        }while(cek==false);
        regular.setCodeName(regex);

        System.out.println("Masukkan name: ");
        regular.setName(input.nextLine().toLowerCase());

        System.out.println("price: ");
        regular.setPrice(input.nextInt());
        arrayList.add(regular);
    }
    private static void addSpecial(ArrayList<Special> arrayList){
        Special special = new Special();
        Scanner input = new Scanner(System.in);
        boolean cek;
        String regex;
        do{
            System.out.println("Masukkan codename: ");
            regex = input.nextLine();
            if(regex.matches("R\\d\\d\\d")){
                cek = true;
            }
            else{
                cek = false;
            }
            
        }while(cek==false);
        special.setCodeName(regex);
        System.out.println("Masukkan name: ");
        special.setName(input.nextLine().toLowerCase());
        System.out.println("price: ");
        special.setPrice(input.nextInt());
        System.out.println("discount: ");
        special.setDiscount(input.nextInt());
        arrayList.add(special);
    }
    private static void showArray(ArrayList<Regular> regulars, ArrayList<Special> specials){
        int i;
        System.out.println("Regular Menu\n");
        System.out.println("===========================================");
        System.out.println("No.| Kode |        Nama       |   Harga   |");
        System.out.println("===========================================");
        for(i=0; i< regulars.size(); i++){
            Regular rg = regulars.get(i);
            String str1 = String.format("%3s|%6s|%19s|%12s|",(i+1),rg.codeName,rg.name,rg.price);
            System.out.println(str1);
        }
        System.out.println("\n\nSpecial Menu\n");
        System.out.println("===========================================");
        System.out.println("No.| Kode |        Nama       |   Harga   |   Discount   |");
        System.out.println("===========================================");
        for(i=0; i< specials.size(); i++){
            Special sp = specials.get(i);
            String str1 = String.format("%3s|%6s|%19s|%12s|",(i+1),sp.codeName,sp.name,sp.price,sp.discount);
            System.out.println(str1);
        }
    }
    private static void removeRegular(ArrayList<Regular> arrayList){
        String keyword;
        System.out.println("Input menu code [R..]: ");
        Scanner input = new Scanner(System.in);
        keyword = input.next();
        arrayList.removeIf(regular1 -> regular1.codeName.equals(keyword));
    }
    private static void removeSpecial(ArrayList<Special> arrayList){
        String keyword;
        System.out.println("Input menu code [R..]: ");
        Scanner input = new Scanner(System.in);
        keyword = input.next();
        arrayList.removeIf(special1 -> special1.codeName.equals(keyword));
    }

    public static void main(String[] args) {
        ArrayList<Regular> regulars = new ArrayList<>();
        ArrayList<Special> specials = new ArrayList<>();
        int choice;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("\nFamily Restaurant");
            System.out.println("==============================");
            System.out.println("1. Add Regular Menu");
            System.out.println("2. Add Special Menu");
            System.out.println("3. Show All Menu");
            System.out.println("4. Delete Regular Menu");
            System.out.println("5. Delete special Menu");
            System.out.println("6. Exit");
            System.out.println("Choice [1-6]: ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    addRegular(regulars);
                    break;
                case 2:
                    addSpecial(specials);
                    break;
                case 3:
                    showArray(regulars, specials);
                    break;
                case 4:
                    removeRegular(regulars);
                    break;
                case 5:
                    removeSpecial(specials);
                    break;
                case 6:
                    break;
            }
        }while(choice<6);
        input.close();
        System.out.println("END");
    }
}
/*import java.lang.*; 
import java.io.*; 
  
class Reguler{
    protected String codeName, name;
    protected int harga;

    public Reguler(){}
    public Reguler(String codeName, String name, int harga){
        this.codeName = codeName;
        this.name = name;
        this.harga = harga;
    }
    public String getCodeName(){
        return this.codeName;
    }
    public String getName(){
        return this.name;
    }
    public int getHarga(){
        return this.harga;
    }
    /*public void setCodeName(String a){
        this.a = codeName;
    }
    public void setName(String b){
        this.b = name;
    }
    public void setHarga(int c){
        this.c = harga;
    }
}

class Special extends Reguler{
    int disc;
    public Special(String codeName, String name, int harga, int disc){
        this.codeName = codeName;
        this.name = name;
        this.harga = harga;
        this.disc = disc;
    }
    public int getDisc(){
        return disc;
    }

}

// Driver class 
public class xad 
{ 
    public static void addReg(ArrayList reguler){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan codename: ");
        String codeName = input.nextLine().toLowerCase();
        System.out.println("Masukkan name: ");
        String name = input.nextLine().toUpperCase();
        System.out.println("harga: ");
        int harga = input.nextInt();
        reguler.add(new Reguler(codeName, name, harga));
        //input.close();
    }
    public static void tampil(ArrayList<Reguler> reguler){
        int i; int n=3;
        System.out.println("Reguler Menu\n");
        System.out.println("===========================================");
        System.out.println("No.| Kode |        Nama       |   Harga   |");
        System.out.println("===========================================");
        for(i=0; i<reguler.size();i++){
            Reguler rg = reguler.get(i);
            System.out.println("%-2s|%-2s|%-2s|%-2s|"+(i+1)+" "+rg.codeName+" "+rg.name+" "+rg.harga);
        }
        /*for(i=0; i<=reguler.size(); i++){
        reguler.forEach(user -> {
            System.out.printf("%-5| %-11s | %-19s | %-7d |",user.getCodeName(), user.getName(), user.getHarga());
            });
        }
    }
    public static void remReg(ArrayList<Reguler> reguler){
        String keyword;
        System.out.println("Input menu code [R..]: ");
        Scanner input = new Scanner(System.in);
        keyword = input.next();
        //if(keyword.matches("r\\d\\d\\d")){
            for(int i=0;i<reguler.size();i++){
                String hapus = reguler.get(i).toString();
                if(hapus.contains(keyword)){
                    reguler.remove(i);
                }
            }
        //}
        
        
    }

    public static void menu(){
        
    }
    public static void main(String[] args) 
    { 
        ArrayList<Reguler> reguler = new ArrayList<>();
        int choice;
        Scanner input = new Scanner(System.in);
        
        do{
        System.out.println("Family Restaurant\n");
        System.out.println("==============================");
        System.out.println("1. Add Regular Menu");
        System.out.println("2. Add Special Menu");
        System.out.println("3. Show All Menu");
        System.out.println("4. Delete Regular Menu");
        System.out.println("5. Delete special Menu");
        System.out.println("6. Exit");
        System.out.println("Choice [1-6]: ");
        choice = input.nextInt();
             
        switch(choice){
            case 1:
                addReg(reguler);
                break;
            case 2:
                break;
            case 3:
                tampil(reguler);
                break;
            case 4:
                remReg(reguler);
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }while(choice<6);
        /*Scanner input = new Scanner(System.in);
        System.out.println("Masukkan codename: ");
        String codeName = input.nextLine().toLowerCase();
        System.out.println("Masukkan name: ");
        String name = input.nextLine().toLowerCase();
        System.out.println("harga: ");
        int harga = input.nextInt();
        System.out.println("Disc: ");
        int disc = input.nextInt();
        input.close();
        reguler.add(new Special(codeName, name, harga, disc));
        reguler.forEach(user -> {
            System.out.println("Name : " + user.getCodeName() + ", Age : " +user.getName()+ "harga: "+ user.getHarga()+ "disc: "+ user.getDisc());
        });
        input.close();
        System.out.println("END");
    }
}*/
