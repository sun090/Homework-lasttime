package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Wordクラスのインスタンス配列
        Word[] words = new Word[5];

        //コマンドラインから入力
        System.out.println("単語と解釈をスペースで仕切って、入力してください。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();


        //どこまで単語を格納したかを表すindexを宣言
        int index = 0;

        while (!input.equals("e")) {
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);
            words[index] = wd;
            index++;

            for (int i = 0; i < index; i++) {
                System.out.println("単語：" + words[i].word + "  日本語解釈：" + words[i].meaning);
            }
            System.out.println(index + "件、登録した。");

            try{
                words[index]=wd;
            }
            catch (IndexOutOfBoundsException e) {
                System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
                for (int i = 0; i < index; i++) {
                    System.out.println("単語：" + words[i].word + "  日本語解釈：" + words[i].meaning);
                }
                break;
            }



            System.out.println("次の単語、入力して。eで終了");
            input = sc.nextLine();

        }


    }
}


