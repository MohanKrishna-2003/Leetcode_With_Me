int romanToInt(char * s){
    int res = 0;
    for(int i=0;i<strlen(s);){
            if(s[i]=='I' && s[i+1]=='V') { res+=4; i+=2;}
            else if(s[i]=='I' && s[i+1]=='X') { res+=9; i+=2;}
            else if(s[i]=='I') { res++; i++;}
            else if(s[i]=='V') { res+=5; i++;}
            else if(s[i]=='X' && s[i+1]=='L') { res+=40; i+=2;}
            else if(s[i]=='X' && s[i+1]=='C') { res+=90; i+=2;}
            else if(s[i]=='X') { res+=10; i++;} 
            else if(s[i]=='L') { res+=50; i++;}
            else if(s[i]=='C' && s[i+1]=='M') { res+=900; i+=2;}
            else if(s[i]=='C' && s[i+1]=='D') { res+=400; i+=2;}
            else if(s[i]=='C') { res+=100; i++;}
            else if(s[i]=='D') { res+=500; i++;}
            else if(s[i]=='M') { res+=1000; i++;}
            else if(s[i]==' ') break;
        }
        return res;

}