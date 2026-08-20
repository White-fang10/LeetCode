class Solution {
    public String toGoatLatin(String sentence) {
        String st[] = sentence.split(" ");
        StringBuilder sb=new StringBuilder();
        int a=1,l=0;
        for(String d:st){
            char c[]=d.toCharArray();
            if(c[0]=='a'||c[0]=='e'||c[0]=='i'||c[0]=='o'||c[0]=='u'||c[0]=='A'||c[0]=='E'||c[0]=='I'||c[0]=='O'||c[0]=='U'){
                sb.append(String.valueOf(c));
                sb.append("ma");
                for(int i=0;i<a;i++){
                   sb.append("a");
                }
            if(l<st.length-1) sb.append(" ");
            a++;
            }else{
                char first = c[0]; 
                for (int i = 0; i < c.length - 1; i++) {
                   c[i] = c[i + 1];
                }
                c[c.length - 1] = first; 
                sb.append(String.valueOf(c));
                sb.append("ma");
                for(int i=0;i<a;i++){
                  sb.append("a");
                }
            if(l<st.length-1) sb.append(" ");
            
            a++;
            }
            l++;
            
        }return String.valueOf(sb);
    }
}