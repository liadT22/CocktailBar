package com.example.cocktailbar;

import com.example.cocktailbar.models.Cocktail;

import java.util.ArrayList;

public interface OnCocktailsFetchedListener {
    void onCocktailsFetched(ArrayList<Cocktail> cocktails);
    void onFetchFailed(Exception e);
}
