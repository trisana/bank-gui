/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dramflix.controllers;
import com.dramaflix.models.DramaflixModels;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class BinarySearchDramaflix {
     public static List<DramaflixModels> performBinarySearchAll(
            int searchValue,
            ArrayList<DramaflixModels> model,
            int low,
            int high
           
    ) {
        List<DramaflixModels> resultModels = new ArrayList<>();

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midTitle = (model.get(mid)).getEpisode();
           
            // Check if the searchValue is present at mid
            if (midTitle == searchValue) {
                // Add the model to the result list
                resultModels.add(model.get(mid));

                // Check for other occurrences in the left and right halves
                int left = mid - 1;
                while (left >= low && (model.get(left)).getEpisode() == searchValue) {
                    resultModels.add(model.get(left));
                    left--;
                }

                int right = mid + 1;
                while (right <= high && (model.get(right)).getEpisode() == searchValue) {
                    resultModels.add(model.get(right));
                    right++;
                }

                return resultModels;
            }

            // If searchValue is greater, ignore the left half
            if (midTitle < searchValue) {
                low = mid + 1;
            }

            // If searchValue is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // If we reach here, then the searchValue was not present
        return resultModels;
    }
     public static List<DramaflixModels> performBinarySearchTitle(
            String searchValue,
            ArrayList<DramaflixModels> model,
            int low,
            int high,
            String filter    
    ) {
        List<DramaflixModels> resultModels = new ArrayList<>();
       
        String tempSearchValue = searchValue.trim().toLowerCase();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            String midValue = model.get(mid).getTitle().trim().toLowerCase();
            int result = midValue.compareTo(tempSearchValue);
            // Check if the searchValue is present at mid
            if (result == 0) {
                // Add the model to the result list
                resultModels.add(model.get(mid));

                // Check for other occurrences in the left and right halves
                int left = mid - 1;
                while (left >= low && (model.get(mid)).getTitle() == searchValue) {
                    resultModels.add(model.get(left));
                    left--;
                }

                int right = mid + 1;
                while (right <= high && (model.get(mid)).getTitle() == searchValue) {
                    resultModels.add(model.get(right));
                    right++;
                }

                return resultModels;
            }

            // If searchValue is greater, ignore the left half
            if (result < 0) {
                low = mid + 1;
            }

            // If searchValue is smaller, ignore the right half
            else {
                high = mid - 1;
            }
        }

        // If we reach here, then the searchValue was not present
        return resultModels;
    }
     }
         

