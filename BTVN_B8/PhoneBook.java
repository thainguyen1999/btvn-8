package BTVN_B8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone {
    ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {
        if (PhoneList.isEmpty()) {
            PhoneList.add(name + "," + phone);
        } else {
            String pb = searchPhone(name);
            if (pb != null) {
                if (!pb.contains(phone)) {
                    PhoneList.set(PhoneList.indexOf(pb), pb + ":" + phone);

                }
            } else {
                PhoneList.add(name + ":" + phone);
            }
        }
    }

    @Override
    public void removePhone(String name) {
        if (PhoneList.isEmpty()) {
            System.out.println("danh ba trong!");
        } else {
            String pb = searchPhone(name);
            if (pb != null) {
                PhoneList.remove(pb);
                System.out.println("da xoa ng dung" + name + "kem sdt");
            } else {
                System.out.println("khong tim thay ng duung" + name + "trong danh ba");
            }
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        if (PhoneList.isEmpty()){
            System.out.println("danh ba trong");
        }else {
            String pb=searchPhone(name);
            if (pb!=null){
                if (!pb.contains(newPhone)){
                    PhoneList.set(PhoneList.indexOf(pb),pb.split(",")[0]+","+newPhone);
                }
            }else {
                System.out.println("khong tim thay ng dung");
            }
        }
    }

    @Override
    public String searchPhone(String name) {
        for (String pb : PhoneList) {
            if (pb.split(",")[0].equals(name)) {
                return pb;
            }
        }
        return null;
    }

    @Override
    public void sort(String name) {
        if (PhoneList.isEmpty()){
            System.out.println("danh ba trong");
        }else {
            //sap xep tang dan
            System.out.println("sapw xep tang dan");
            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    /*
                    if(o1.compareTo (o2)>0){
                        return 1;
                    }else if(o1.compareTo (o2)==0) {
                        return 0;
                    }
                    return -1;
                    */
                    return o1.compareTo(o2);
                }
            });
            System.out.println(PhoneList);
            System.out.println("sapw xep giam dan");
            Collections.sort(PhoneList, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return o2.compareTo(o1);
                }
            });
            System.out.println(PhoneList);
        }
    }
}
