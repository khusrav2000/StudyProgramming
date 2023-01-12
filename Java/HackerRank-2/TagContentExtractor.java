import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import javax.swing.text.html.parser.TagElement;

public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String line = in.nextLine();
      Boolean openTagStart = false;
      Boolean closeTagStart = false;
      Boolean contentStart = false;
      String tagName = "";
      String content = "";
      String startTagName = "";
      Boolean isNone = true;
      for (char c: line.toCharArray()) {
        if (c == '<'){
          openTagStart = true;
          contentStart = false;
          tagName = "";
        }
        else if (c == '/') {
          if (openTagStart == true && tagName.length() == 0){
            openTagStart = false;
            closeTagStart = true;
          }
        }
        else if (c == '>') {
          if (openTagStart) {
            if(tagName.length() > 0) {
              startTagName = tagName;
              openTagStart = false;
              contentStart = true;
              tagName = "";
            } 
          } else if (closeTagStart) {
            if (tagName.length() > 0 && startTagName.equals(tagName)) {
              if (content.length() > 0) {
                System.out.println(content);
                isNone = false;
              }
              
            } 
            tagName = "";
            content = "";
            startTagName = "";
            closeTagStart = false;
          }
        } else {
          if (contentStart) {
            content += c;
          } else if (openTagStart){
            tagName += c;
            content = "";
          } else if (closeTagStart){
            tagName += c;
          }
        }
      }

      if (isNone){
        System.out.println("None");
      }
			
			testCases--;
		}
	}
}