package br.com.projeto.screenmatch.service;

public interface IConverteDados {
    <T> T obterDadis(String json, Class<T> classe);
}
