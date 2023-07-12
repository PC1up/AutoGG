package top.einsluca.autogg.server;

import java.util.List;

public class MyPvPConfiguration implements ServerConfiguration {

    @Override
    public List<String> getServerAddress() {
        return List.of("mypvp.me", "play.mypvp.me", "mypvp.eu", "mypvp.net", "mypvp.cloud", "besterserver.de", "minecraft.ms", "minekube.eu", "server.gratis", "userserver.net");
    }

    @Override
    public List<String> getFormat() {
        return List.of("Deine Spiel-Statistiken", "Your game statistics");
    }

    @Override
    public List<String> getFilter() {
        return List.of("Player", "Legend", "Premium");
    }
}
