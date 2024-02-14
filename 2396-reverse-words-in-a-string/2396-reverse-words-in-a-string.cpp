class Solution {
public:
void reverse(char *s,int len){
	int i=0;
	char temp;
	while(i<len/2)
	{
		temp=s[i];
		s[i]=s[len-i-1];
		s[len-i-1]=temp;
		i++;
	}
}
void reverseWords(string &h) {
    int i,len=h.size();
    int flag=0;
     for(i=0;i<len;i++){
         if(!isspace(h[i])){flag++;break;}
        if(flag==0){
            h="";
            return; 
        }
       
     }
	char s[len+1],*t;
	for(i=0;i<len;i++)s[i]=h[i];
	s[len]='\0';
	reverse(s,len);
	t=s;
	for(i=0;i<len;i++){
		if(s[i]==' '&& i<len-1 ){
			reverse(t,&s[i]-t);
			t=&s[i+1];
		}
		else if (i==len-1)
		{
			reverse(t,&s[i]-t+1);
		}


	}
	for(i=0;i<len;i++)h[i]=s[i];
    }

};