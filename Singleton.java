class Singleton{ 

 
public enum EnumSingleton {
    SINGLE_INSTANCE;
    int value;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
}
  public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.SINGLE_INSTANCE;
        singleton.setValue(2);
        System.out.println(singleton.getValue());
  }
}