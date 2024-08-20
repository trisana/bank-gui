/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramflix.controllers;
import java.util.ArrayList;
import com.dramaflix.models.DramaflixModels;
/**
 *
 * @author USER
 */
public class MergesortDramaflix {
   
    public MergesortDramaflix(){
    }
    public void sort(ArrayList<DramaflixModels> a, String sort){
        int datasize = a.size();
        if(datasize <=1){
            return;
        }
       
        int mid = datasize / 2;
        ArrayList<DramaflixModels> first = new ArrayList<>(a.subList(0, mid));
        ArrayList<DramaflixModels> second = new ArrayList<>(a.subList(mid, datasize));
       
        sort(first,sort);
        sort(second,sort);
        merge(first,second,a,sort);
           
    }

    private void merge(ArrayList<DramaflixModels> first, ArrayList<DramaflixModels> second, ArrayList<DramaflixModels> mainModels, String sort) {
        int firstCounter = 0;
        int secondCounter = 0;
        int mainArrayCounter = 0;
       
        while (firstCounter < first.size() && secondCounter < second.size()){
            switch (sort) {
                case "S.No." ->{
                  if((first.get(firstCounter)).getS_no() < (second.get(secondCounter).getS_no()))
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                 case "Title" ->{
                  if((first.get(firstCounter)).getTitle().compareTo((second.get(secondCounter).getTitle())) <= 0)
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                 case "Director" ->{
                  if((first.get(firstCounter)).getDirector().compareTo((second.get(secondCounter).getDirector())) <= 0)
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                 case "Screenwriter" ->{
                  if((first.get(firstCounter)).getScreenwriter().compareTo((second.get(secondCounter).getScreenwriter())) <= 0)
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                case "Genre" ->{
                  if((first.get(firstCounter)).getGenre().compareTo((second.get(secondCounter).getGenre())) <= 0)
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                case "Rating" ->{
                  if((first.get(firstCounter)).getRating() < (second.get(secondCounter).getRating()))
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                case "Episode" ->{
                  if((first.get(firstCounter)).getEpisode() < (second.get(secondCounter).getEpisode()))
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                case "Network" ->{
                  if((first.get(firstCounter)).getNetwork().compareTo((second.get(secondCounter).getNetwork())) <= 0)
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                case "Aired" ->{
                  if((first.get(firstCounter)).getAired().compareTo((second.get(secondCounter).getAired())) <= 0)
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                case "Country" ->{
                  if((first.get(firstCounter)).getCountry().compareTo((second.get(secondCounter).getCountry())) <= 0)
                  {
                     mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                  }else{
                      mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                  }
                }
                default -> {
                    return;
                }
            }
             mainArrayCounter++;
        }
           while (firstCounter < first.size()){
               mainModels.set(mainArrayCounter,first.get(firstCounter));
                     firstCounter++;
                     mainArrayCounter++;
           }
           
           while (secondCounter < second.size()){
               mainModels.set(mainArrayCounter,second.get(secondCounter));
                     secondCounter++;
                     mainArrayCounter++;
           }
    }
}

