package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;

public class MovieStoreRunner {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        Map<String, List<String>> movieMap = movieStore.getMovies();

        final String moviesFullList = movieMap.entrySet()
                .stream()
                .flatMap(n -> {
                                List<String> list = new ArrayList<>();
                                list.add(n.getKey());
                                list.addAll(n.getValue());
                                return list.stream();
                              }
                         )
                .collect((Collectors.joining(" ! ")));

        System.out.println(moviesFullList);
    }
}
