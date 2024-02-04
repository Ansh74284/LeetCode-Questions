class Solution {
    public int reverse(int x) {
        int num = Math.abs(x); //Original Number ka Absolute value nikala
        
        int rev = 0; //Reverse Number

        while(num != 0) {
            int ld = num % 10; //Last Digit Nikala

            //OverFlow Check
            if(rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0; //Agar Overflow hua, toh 0 return kardo
            }

            rev = rev * 10 + ld; //Reverse mein digit ko add kiya
            num = num / 10; //Last digit hata diya , next iteration ke liye
        }

        return (x < 0) ? (-rev) : rev ; //Original Number ke sign ke hisaab se result diya
    }
}

//Ek integer uthaya x = 123
//usko palat diya 321 mein 

// 1.Reversed number (rev) ko 0 se shuru karo:
// Jaise hi humein ek number ka reverse nikalna hai, hum shuruwat mein reverse number ko 0 se initialize karte hain.

// 2.Har digit ko loop ke dwara check karo:
// Har digit ko dekho, iske liye hum loop ka istemal karte hain.

// 3.Har digit ko reversed number mein add karne se overflow hoga ya nahi, yeh check karo:
// Har bar jab hum ek digit ko reversed number mein add karte hain, tab yeh dekhte hain ki kya yeh next iteration mein overflow karega ya nahi.

// 4.Agar overflow hota hai, toh 0 return karo:
// Agar overflow detect hota hai, matlab agar reversed number bahut bada ho gaya hai, toh hum 0 return karte hain.

// 5.Warna, reversed number ko 10 se multiply karke current digit ko add karo aur process ko continue karo:
// Agar overflow nahi hua, toh hum reversed number ko 10 se multiply karte hain aur current digit ko add karte hain. Fir hum next digit ke liye is process ko continue karte hain.

// 6.Yeh process tab tak chalti hai jab tak saare digits process ho jaye:
// Hum yeh process har digit ke liye repeat karte hain jab tak saare digits process ho jaye.

// 7.Reversed number ko appropriate sign ke sath return karo:
// Ant mein, hum reversed number ko input number ke sign ke hisaab se return karte hain