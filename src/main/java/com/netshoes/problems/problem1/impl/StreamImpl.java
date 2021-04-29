package com.netshoes.problems.problem1.impl;


import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class StreamImpl implements Stream {
    private final char[] chars;
    private int current;

    // TODO sua implementacao! Fique a vontade para criar suas classes/interfaces caso julgue necessario.

    // Nao alterar esse construtor!
    public StreamImpl(String stream) {
        this.chars = (stream != null) ? stream.toCharArray() : new char[0];
        this.current = 0;
    }

    @Override
    public char getNext() {
        char c = this.chars[current];
        current++;
        return c;
    }

    @Override
    public boolean hasNext() {
        return (current) < this.chars.length;
    }
}
