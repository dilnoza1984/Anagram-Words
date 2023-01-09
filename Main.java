import java.util.Arrays;

class Main {
  public static void main(String[] args) {
   System.out.println(isAnagram("abc","abb")); 
                                        System.out.println(isAnagram("listen","silent")); 
    System.out.println(isAnagram("bored","robed")); 
   System.out.println(isAnagram("night","thing")); 
   System.out.println(isAnagram("stressed","desserts")); 
    System.out.println(isAnagram("cola","loco")); 

    
  }


  public static boolean isAnagram(String str1, String str2){
     if(str1.length() !=str2.length()){
       return false;
     }else{
       char[] arr1 = str1.toCharArray();
       char[] arr2 = str2.toCharArray();
       Arrays.sort(arr1);
        Arrays.sort(arr2);
       return Arrays.equals(arr1,arr2);
     }
      
      
  }
}