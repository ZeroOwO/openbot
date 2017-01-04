package xyz.kieen.openbot;

import java.io.*;
import java.util.*;
import java.net.*;
import java.security.*;
import java.nio.channels.*;
import javax.crypto.Cipher;
import org.json.*;

/**
 *
 * @author Patrick
 */
public class Worker {
    private final boolean work = true;
        private boolean answer(Integer to, boolean isChat, String text, float placeholder) throws IOException, InterruptedException {
        File dictinary = new File(".openBotRoot/dict.ssd");
        Scanner scn0 = new Scanner(dictinary);
         
        return true;
    }
    public void start(long bot, String token) throws InterruptedException, IOException {
        while(true) {
            wait(100);
            if(!work) {
                break;
            } else {
                String key = "dftyu58t9e";
                File offset = new File(".openBotRoot/." + token + "/.OFFSET");
                String offset_s = new Scanner(offset).nextLine();
                URL source = new URL("https://api.vk.vom/method/messages.get?last_message_id=" + offset + "&auth_token=" + token + "&v=4.94");
                ReadableByteChannel sourcestream = Channels.newChannel(source.openStream());
                FileOutputStream sourcein = new FileOutputStream(".openBotRoot/." + token + "/.MESSAGES.db");
                sourcein.getChannel().transferFrom(sourcestream, 0, Long.MAX_VALUE);
                JSONObject rspn = new JSONObject(".openBotRoot/." + token + "/.MESSAGES.db");
                JSONArray rspn0 = rspn.getJSONArray("response");
                JSONArray msg = rspn0.getJSONArray(1);
                for(Integer i = 0; i < msg.length(); i++) {
                    if(i == 0) {
                        JSONObject message = msg.getJSONObject(i);
                        PrintWriter ofst = new PrintWriter(offset);
                        answer(message.getInt("uid"), false, message.getString("body"), 22);
                    }
                    JSONObject message = msg.getJSONObject(i);
                    answer(message.getInt("uid"), false, message.getString("body"), 22);
                }
            }
        }
    }
}
Contact GitHub API Training Shop Blog About
