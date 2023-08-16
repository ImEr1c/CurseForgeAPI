package com.imer1c.requests;

import com.imer1c.properties.IProperty;
import com.imer1c.requests.body.*;
import com.imer1c.requests.curse.GetCategoriesRequest;
import com.imer1c.requests.curse.GetFilesRequest;
import com.imer1c.requests.curse.GetVersionTypesRequest;
import com.imer1c.requests.curse.GetVersionsRequest;
import com.imer1c.requests.fingerprint.GetFingerprintsFuzzyMatchesRequest;
import com.imer1c.requests.fingerprint.GetFingerprintsMatchesRequest;
import com.imer1c.requests.games.GetGameRequest;
import com.imer1c.requests.games.GetGamesRequest;
import com.imer1c.requests.minecraft.*;
import com.imer1c.requests.mods.*;
import com.imer1c.schemas.responses.*;

public class RequestHandler {
    private final String apiKey;

    public RequestHandler(String apiKey) {
        this.apiKey = apiKey;
    }

    public GetGamesResponse handleGetGames(IProperty<?>... properties) {
        return new GetGamesRequest(properties).getResponse(apiKey);
    }

    public GetGameResponse handleGetGame(int gameId, IProperty<?>... properties) {
        return new GetGameRequest(gameId, properties).getResponse(apiKey);
    }

    public GetVersionsResponse handleGetGameVersions(int gameId, IProperty<?>... properties) {
        return new GetVersionsRequest(gameId, properties).getResponse(apiKey);
    }

    public GetVersionTypesResponse handleGetGameVersionTypes(int gameId, IProperty<?>... properties) {
        return new GetVersionTypesRequest(gameId, properties).getResponse(apiKey);
    }

    public GetCategoriesResponse handleGetCategories(IProperty<?>... properties) {
        return new GetCategoriesRequest(properties).getResponse(apiKey);
    }

    public GetSearchModsResponse handleSearchMods(IProperty<?>... properties) {
        return new GetSearchModsRequest(properties).getResponse(apiKey);
    }

    public GetModResponse handleGetMod(int modId, IProperty<?>... properties) {
        return new GetModRequest(modId, properties).getResponse(apiKey);
    }

    public GetModsResponse handleGetMods(GetModsByIdsListRequestBody body) {
        return new GetModsRequest(body).getResponse(apiKey);
    }

    public GetFeaturedModsResponse handleFeaturedMods(GetFeaturedModsRequestBody body) {
        return new GetFeaturedModsRequest(body).getResponse(apiKey);
    }

    public GetStringResponse handleModDescription(int modId, IProperty<?>... properties) {
        return new GetModDescriptionRequest(modId, properties).getResponse(apiKey);
    }

    public GetModFileResponse handleModFile(int modId, int fileId, IProperty<?>... properties) {
        return new GetModFileRequest(modId, fileId, properties).getResponse(apiKey);
    }

    public GetModFilesResponse handleModFiles(int modId, IProperty<?>... properties) {
        return new GetModFilesRequest(modId, properties).getResponse(apiKey);
    }

    public GetFilesResponse handleFiles(GetModFilesRequestBody body) {
        return new GetFilesRequest(body).getResponse(apiKey);
    }

    public GetStringResponse handleModFileChangelog(int modId, int fileId) {
        return new GetModFileChangelogRequest(modId, fileId).getResponse(apiKey);
    }

    public GetStringResponse handleModFileDownloadUrl(int modId, int fileId) {
        return new GetModFileDownloadURLRequest(modId, fileId).getResponse(apiKey);
    }

    public GetFingerprintsMatchesResponse handleFingerprintsMatches(GetFingerprintMatchesRequestBody body) {
        return new GetFingerprintsMatchesRequest(body).getResponse(apiKey);
    }

    public GetFingerprintsFuzzyMatchesResponse handleFingerprintsFuzzyMatches(GetFuzzyMatchesRequestBody body) {
        return new GetFingerprintsFuzzyMatchesRequest(body).getResponse(apiKey);
    }

    public ApiResponseOfListOfMinecraftGameVersion handleMinecraftVersions(IProperty<?>... properties) {
        return new GetMinecraftVersionsRequest(properties).getResponse(apiKey);
    }

    public ApiResponseOfMinecraftGameVersion handleGameVersion(String gameVersion, IProperty<?>... properties) {
        return new GetSpecificMinecraftVersionRequest(gameVersion, properties).getResponse(apiKey);
    }

    public ApiResponseOfListOfMinecraftModLoaderIndex handleMinecraftModLoaders(IProperty<?>... properties) {
        return new GetMinecraftModLoadersRequest(properties).getResponse(apiKey);
    }

    public ApiResponseOfMinecraftModLoaderVersion handleModLoader(String modLoaderName, IProperty<?>... properties) {
        return new GetSpecificMinecraftModLoaderRequest(modLoaderName, properties).getResponse(apiKey);
    }

}
