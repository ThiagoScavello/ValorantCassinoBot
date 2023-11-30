package me.thiagoscavello.valorantcassinobot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

/**
 * Hello world!
 *
 */
public class App {
	private final static String BOT_TOKEN ="MTE3OTU1OTYzMzMyNTY2NjM1NQ.GsXet4.46Ycf1565yKqMCxoeSOjW9PweqDGNbA_39-J_I";
	public static void main(String[] args) throws InterruptedException {
		
		JDA jda = JDABuilder.createDefault(BOT_TOKEN)
				.build()
				.awaitReady();
	}
}
