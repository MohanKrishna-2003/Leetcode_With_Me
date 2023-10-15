class Solution {
    public String addStrings(String num1, String num2) {
        int carry = 0;
        int i = num1.length()-1, j = num2.length()-1;
        StringBuffer sb = new StringBuffer();
        while(i>=0 || j>=0 || carry>0)
        {
            int val1 = (i>=0) ? num1.charAt(i)-48 : 0;
            int val2 = (j>=0) ? num2.charAt(j)-48 : 0;

            int sum = val1 + val2 + carry;
            carry = sum/10;
            sb.insert(0, sum%10);
            i--;
            j--;
        }
        return sb.toString();

    }
}