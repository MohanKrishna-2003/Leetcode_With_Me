class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        while(i>=0 || j>=0 || carry>0)
        {
            int sum = carry;
            if(i>=0)
                sum += a.charAt(i--) - 48;
            if(j>=0)
                sum += b.charAt(j--) - 48;

            sb.insert(0, sum%2);
            carry = sum/2;
            
        }
        return sb.toString();
    }
}