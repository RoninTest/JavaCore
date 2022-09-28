package CreatMethod;

public class VoidMethod {
    public static void main(String[] args) {


        discountPriceCalculate(true,4,1200,true);
        isnotdiscountPriceCalculate(1200);
        isnotdiscountPriceCalculate(1800);
        discountPriceCalculatenotMemberCard(true,5,1800,false);




    }

    public static void discountPriceCalculate(boolean isMember, int membersYear, int salePrice, boolean musteriCard){
        if (isMember == true && musteriCard == true){

            if(membersYear < 5)
            {

                double newPrice=salePrice*0.3+salePrice;
                System.out.println(newPrice);

            }else if(membersYear > 5)
            {
                double newPrice=salePrice*0.4+salePrice;
                System.out.println(newPrice);
            }

        }

    }

    public static void discountPriceCalculatenotMemberCard(boolean isMember, int membersYear, int salePrice, boolean musteriCard){
        if (isMember == true && musteriCard == false){

            if(membersYear < 5)
            {

                double newPrice=salePrice*0.1+salePrice;
                System.out.println(newPrice);

            }else if(membersYear > 5)
            {
                double newPrice=salePrice*0.2+salePrice;
                System.out.println(newPrice);
            }

        }

    }


    public static int isnotdiscountPriceCalculate(int salePrice){
        double newPrice=salePrice*0.5+salePrice;
        System.out.println(newPrice);
        return (int) newPrice;
    }
}
