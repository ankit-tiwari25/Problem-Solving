package Striver.Arrays;

import java.util.HashSet;
import java.util.Set;

// 929[Easy]. Unique Email Addresses
// TODO : Need to go through again
public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(uniqueEmailAddresses(emails));

    }
    public static int uniqueEmailAddresses(String[] emails){
        final Set<String> set = new HashSet<>();
        int count = 0;

        for(final String email : emails) {
            final StringBuilder sb = new StringBuilder();
            int i = 0;
            boolean isLocalName = true;

            while(i < email.length()) {
                if(isLocalName) {
                    if(email.charAt(i) == '+')
                        while(i < email.length() && email.charAt(i) != '@')
                            i++;

                    if(email.charAt(i) != '.')
                        sb.append(email.charAt(i));

                    if(email.charAt(i) == '@')
                        isLocalName = false;
                } else {
                    sb.append(email.charAt(i));
                }

                i++;
            }

            final String e = sb.toString();

            if(!set.contains(e)) {
                set.add(e);
                count++;
            }
        }

        return count;
    }
    public static void display(String arr[]){
        for(String i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
