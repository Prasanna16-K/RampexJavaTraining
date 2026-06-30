package Day8.CLASSTASK;

import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        String[] menu={"veg","non veg","sweets","beverages"};
        String[] menu1=new String [menu.length];
        for(int i=0;i<menu.length;i++){
            menu1[i]=menu[menu.length-1-i];
        }
        System.out.println(Arrays.toString(menu1));
    }
}
