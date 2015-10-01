/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaparser;

import java.io.File;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JavaParser
{

    
    public static void main(String[] args)
    {
         Document doc = null;
         File input = new File("/Users/cheater/Dropbox/work/Coder/Java/JavaParser/src/javaparser/HTML.html");
        try 
        {
//                doc = Jsoup.connect("http://developer.alexanderklimov.ru/android/").get();
            doc = Jsoup.parse(input, "UTF-8", "http://example.com/");
        } 
        catch (IOException e) 
        {
		e.printStackTrace();
        }

//        String title = doc.title();
//        System.out.println(doc.title());
         
        String keywords2 = doc.select("meta[itemprop=lowPrice").first().attr("content");
	System.out.println("Meta keyword2 : " + keywords2);
 
        String keywords3 = doc.select("h1[class=title title_size_32   title_changeable_yes").first().attr("title");
	System.out.println("Meta keyword3 : " + keywords3);
  
    }
}


