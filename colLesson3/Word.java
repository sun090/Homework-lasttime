package com.company;

public class Word {
    public String word;
    public String meaning;

    public Word (String word ,String meaning){
        this.word=word;
        this.meaning=meaning;
    }
    @Override
    public String toString(){
        return "単語：" + this.word + "  日本語解釈：" + this.meaning;
    }


}
