/*
package com.javarush.task.task18.task1827;

*/
/*
Прайсы C:\\Users\\JRebel\\Desktop\\file.txt
*//*


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        if (args.length > 0 && args[0].equals("-c")) {

            String filepath = getFilePath();
            int id = getLatestID(filepath);
            String sID = id + "";

            StringBuilder builder = new StringBuilder();

            builder.append("\n");
            builder.append(getFormattedString(sID, 8));
            builder.append(getFormattedString(args[1], 30));
            builder.append(getFormattedString(args[2], 8));
            builder.append(getFormattedString(args[3], 4));

            String result = builder.toString();

            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true));

            writer.write(result);

            writer.close();
        }
    }

    public static String getFormattedString(String input, int limit) {
        String limited;

        if (input.length() < limit) {
            limited = input;
        } else {
            limited = input.substring(0, limit);
        }

        return String.format("%-"+ limit +"s", limited);
        //return limited.trim();
    }

    public static int getLatestID(String filePath) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(filePath));

        String lastLine = "";

        while (fileReader.ready()) {
            lastLine = fileReader.readLine();
        }

        int latestID = Integer.parseInt(getFormattedString(lastLine, 8).trim()) + 1;
        fileReader.close();
        return latestID;
    }

    public static String getFilePath() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        return fileName;
    }
}
*/

package com.javarush.task.task18.task1827;

/*
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.max;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        if(args.length > 0 && args[0].equals("-c")) {
            BufferedReader inStream = new BufferedReader(new FileReader(fileName));
            int d;
            int mx = 0;
            while(inStream.ready()) {
                d = Integer.parseInt(inStream.readLine().substring(0, 8).trim()) + 1;
                mx = max(mx, d);
            }
            inStream.close();
            BufferedWriter outStream = new BufferedWriter(new FileWriter(fileName, true));

            String id = String.valueOf(mx);
            String pn = args[1];
            String pr = args[2];
            String qu = args[3];

            while(id.length() < 8) {
                id = id + " ";
            }
            while(pn.length() < 30) {
                pn = pn + " ";
            }
            while(pr.length() < 8) {
                pr = pr + " ";
            }
            while(qu.length() < 4) {
                qu = qu + " ";
            }
            outStream.write(System.lineSeparator() + id.substring(0, 8) + pn.substring(0, 30) + pr.substring(0, 8) + qu.substring(0, 4));

            outStream.close();
        }
    }
}
