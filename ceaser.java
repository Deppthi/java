class ceaser{

    public static String encrypt(String pt, int s) {
        String str="";
        for (int i = 0; i < pt.length(); i++) {
            int a = pt.charAt(i);
            char ch;
            if (Character.isUpperCase(pt.charAt(i))) {
                
                 ch= (char)((a-s-65)%26+ 65 );
        
            } else {
                 ch= (char)((a-s-97)%26+ 97 );           
            }
            str+=ch;     
        }
        return str;
    }
    
    public static void main(String[] args) {
        String pt = "school";
        int s = 2;
        System.out.println( encrypt(pt, s));
    }
}