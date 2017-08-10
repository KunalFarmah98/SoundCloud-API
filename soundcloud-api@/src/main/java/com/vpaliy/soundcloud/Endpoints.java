package com.vpaliy.soundcloud;

@SuppressWarnings({"UnusedDeclaration"})
public interface Endpoints {
    String TOKEN = "oauth2/token";

    String TRACKS              = "tracks";
    String TRACK_DETAILS       = "tracks/{id}";
    String TRACK_COMMENTS      = "tracks/{id}/comments";
    String TRACK_FAVORITERS    = "tracks/{id}/favoriters";
    String TRACK_PLAYS         = "tracks/{id}/plays";
    String TRACK_PERMISSIONS   = "tracks/{id}/permissions";

    String PLAYLISTS            = "playlists";
    String PLAYLIST_DETAILS     = "playlists/{id}";
    String PLAYLIST_SECRET_TOKEN= "playlists/{id}/secret-token";
    String PLAYLIST_TRACKS      = "playlists/{id}/tracks";

    String USERS               = "users";
    String USER_DETAILS        = "users/{id}";
    String USER_FOLLOWINGS     = "users/{id}/followings";
    String USER_FOLLOWERS      = "users/{id}/followers";
    String USER_TRACKS         = "users/{id}/tracks";
    String USER_FAVORITES      = "users/{id}/favorites";
    String USER_PLAYLISTS      = "users/{id}/playlists";

    String ME                  = "me";
    String ME_CONNECTIONS      = "me/connections";
    String ME_ACTIVITIES       = "me/activities/tracks";
    String ME_EXCLUSIVE_TRACKS = "me/activities/tracks/exclusive";
    String ME_NEWS             = "me/activities/all/own";
    String ME_TRACKS           = "me/tracks";
    String ME_PLAYLISTS        = "me/playlists";
    String ME_FAVORITES        = "me/favorites";
    String ME_FAVORITE         = "me/favorites/{id}";
    String ME_FOLLOWERS        = "me/followers";
    String ME_FOLLOWER         = "me/followers/{id}";
    String ME_FOLLOWINGS       = "me/followings";
    String ME_FOLLOWING        = "me/followings/{id}";
    String ME_CONFIRMATION     = "me/email-confirmations";
    String ME_FRIENDS          = "me/connections/friends";
    String ME_DEVICES          = "me/devices";

    String SUGGESTED_USERS     = "users/suggested";

    String RESOLVE             = "resolve";

    String APPS                = "apps";

    String SEND_PASSWORD       = "passwords/reset-instructions";
    String CONNECT             = "connect";
    String FACEBOOK_CONNECT    = "connect/via/facebook";
}