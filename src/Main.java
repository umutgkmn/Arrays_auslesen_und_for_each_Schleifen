public class Main {

    public static void main(String[] args) {

        int [] zahlenArray = new int [10];
        int [] derArray = {0,1,2,3,4,5,6,7,8,9};
        String [] freunde = {"Wlad", "Andi", "Mats","Michi","Eminem","Superman"};

        for(int i = 0; i < freunde.length; i++){
            System.out.println(freunde[i]);
        }
        //System.out.println(freunde[0]);
        //System.out.println(freunde[2]);
        //freunde [0] = "Michi";
        //System.out.println(freunde[0]);

        //FOR EACH
        for(String freund: freunde){
            System.out.println(freund);
        }

        //FOR EACH loop der durch der Array durchläuft

        for (int array: derArray){
            System.out.println(array);
        }

        for (int i = 0; i< derArray.length; i++){
            System.out.println(derArray[i]);
        }
    }
}
