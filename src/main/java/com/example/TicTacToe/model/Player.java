package com.example.TicTacToe.model;

import com.example.TicTacToe.DTO.PlayerDTO;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "PLAYERS")
public class Player extends PlayerDTO implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public Player() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
