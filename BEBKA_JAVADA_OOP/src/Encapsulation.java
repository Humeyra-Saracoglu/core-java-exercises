public class Encapsulation {

    private String marka;
    private String model;
    private int yıl;

    public String getMarka()
    {
        return marka;
    }

    public void setMarka(String marka)
    {
        this.marka = marka;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYıl()
    {
        return yıl;
    }

    public void setYıl(int yıl)
    {
        this.yıl = yıl;
    }


    public static void main(String[] args) {
        Encapsulation myCar = new Encapsulation();

        myCar.setMarka("TOGG");
        myCar.setModel("T10X");
        myCar.setYıl(2023);

        System.out.println("Marka : " + myCar.getMarka());
        System.out.println("Model : " + myCar.getModel());
        System.out.println("Yıl   : " + myCar.getYıl());
    }
}
