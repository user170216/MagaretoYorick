package com.magareto.yorick.commands;

import com.magareto.yorick.bot.command.CommandModel;
import com.magareto.yorick.bot.command.YorickCommand;
import com.magareto.yorick.bot.command.annotations.Command;
import com.magareto.yorick.bot.exception.YorickException;
import com.magareto.yorick.bot.globals.Globals;
import com.magareto.yorick.models.manhwa.ManhwaFilter;
import com.magareto.yorick.service.ManhwaService;
import discord4j.core.object.entity.Message;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Command(name = "manhwa", description = "Recommends manhwa and it can be used as a read list.")
public class ManhwaCommand extends YorickCommand {

    private ManhwaService manhwaService = Globals.injector.getInstance(ManhwaService.class);

    @Override
    public void execute(Message message, CommandModel commandModel) throws YorickException, Exception {
        Map<String, String> args = commandModel.getArgs();
//        if(args.get(""))

        if (args.get("rec") != null) {
            ManhwaFilter manhwaFilter = new ManhwaFilter();
            String genres = args.get("genres");
            String title = args.get("title");
            if (genres != null) {
                String trimmed = genres.trim();
                List<String> filterGenres = Arrays.asList(trimmed.split(","));
                manhwaFilter.setGenres(filterGenres);
            }

            if(title != null) {

            }

        }

//        manhwaService.test();

    }

    @Override
    public List<String> getArguments() {
        return null;
    }

    @Override
    public String getHelp() {
        return null;
    }
}
