package mk.finki.ukim.mk.lab.repository;

import mk.finki.ukim.mk.lab.model.Balloon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class BalloonRepository {

    List<Balloon> listBalloons = new ArrayList<>(10);


    public List<Balloon> findAllBalloons() {
        return listBalloons;
    }
    public List<Balloon> findAllByNameOrDescription(String text) {
        return listBalloons.stream().filter(r->r.getName().contains(text) || r.getDescription().contains(text)).collect(Collectors.toList());
    }
}
