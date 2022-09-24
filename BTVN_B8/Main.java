package BTVN_B8;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb=new PhoneBook();
        pb.insertPhone("nguyen","0363619872");
        pb.removePhone("an");
        pb.updatePhone("thuy","0129309","0123456789");
        pb.sort("");
        for (String pl: pb.PhoneList){
            System.out.println(pl);
        }
    }
}
