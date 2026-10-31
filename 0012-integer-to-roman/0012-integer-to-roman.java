class Solution {
    public String intToRoman(int num) {
        String str= new String("");
        while(num>=1000){
            str+='M';
            num-=1000;
        }
        if(num>=900 && num<1000){
            str+="CM";
            num-=900;
        }
        while(num>=500){
            str+='D';
            num-=500;
        }
        if(num>=400 && num<500){
            str+="CD";
            num-=400;
        }
        while(num>=100){
            str+='C';
            num-=100;
        }
        if(num>=90 && num<100){
            str+="XC";
            num-=90;
        }
        while(num>=50){
            str+='L';
            num-=50;
        }
        if(num>=40 && num<50){
            str+="XL";
            num-=40;
        }
        while(num>=10){
            str+='X';
            num-=10;
        }
        if(num==9){
            str+="IX";
            return str;
        }
        while(num>=5){
            str+='V';
            num-=5;
        }
        if(num==4){
            str+="IV";
            return str;
        }
        while(num>0){
            str+='I';
            num-=1;
        }
        return str;
        
    }
}