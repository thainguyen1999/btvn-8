package BTVN_B8;

public abstract class Phone {
    public abstract  void insertPhone(String name,String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String oldPhone, String newPhone);
    public abstract String searchPhone(String name);
    public abstract void sort(String name);
}
