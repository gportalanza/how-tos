class NewPasswordGenerator 
{ 
    public static void main(String args[]) { 
        String a = "qweqqweqweq";
        String b = "!·$$%$%";
    
        int lena = a.length();
        int lenb = b.length();
        int min = 0;
        String pwd1 = "";
        String pwd2 = "";

        if (a != "" && b != "") {
            if (lena >= lenb) {
                min = lenb;
                pwd2 = a.substring(lenb);
            } else {
                min = lena;
                pwd2 = b.substring(lena);
            }
            for (int i = 0; i < min; i++) {
                pwd1 = pwd1 + a.substring(i, i+1) + b.substring(i, i+1);
            }
            System.out.println(" ==>> New Password genrated: " + pwd1 + pwd2);
        } else {
            System.out.println(" ==>> Error. Can't generate a new password!");
        } 
    } 
} 