package com.imer1c;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.imer1c.profile.CurseforgeProfile;
import com.imer1c.properties.IProperty;
import com.imer1c.requests.RequestHandler;
import com.imer1c.requests.body.*;
import com.imer1c.schemas.Category;
import com.imer1c.schemas.files.CurseFile;
import com.imer1c.schemas.files.mod.Mod;
import com.imer1c.schemas.fingerprint.FingerprintFuzzyMatchResult;
import com.imer1c.schemas.fingerprint.FingerprintsMatchesResult;
import com.imer1c.schemas.games.Game;
import com.imer1c.schemas.games.GameVersionType;
import com.imer1c.schemas.games.GameVersionsByType;
import com.imer1c.schemas.games.minecraft.MinecraftGameVersion;
import com.imer1c.schemas.games.minecraft.MinecraftModLoaderVersion;
import com.imer1c.schemas.games.minecraft.MinecratModLoaderIndex;
import com.imer1c.schemas.responses.*;

import java.io.*;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public class CurseforgeAPIProvider implements CurseforgeAPI {
    public static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private final RequestHandler requestHandler;

    public CurseforgeAPIProvider(RequestHandler requestHandler) {
        this.requestHandler = requestHandler;
    }

    public static CurseforgeAPIProvider init(String apiKey) {
        return new CurseforgeAPIProvider(new RequestHandler(apiKey));
    }

    @Override
    public CurseforgeProfile decryptProfile(ZipFile zip) {
        ZipEntry entry = zip.getEntry("manifest.json");

        InputStream inputStream;
        try
        {
            inputStream = zip.getInputStream(entry);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        InputStreamReader reader = new InputStreamReader(inputStream);

        return GSON.fromJson(reader, CurseforgeProfile.class);
    }

    @Override
    public boolean isCurseForgeZip(File f) {
        if (!f.getName().endsWith(".zip"))
        {
            return false;
        }

        ZipFile zip;
        try
        {
            zip = new ZipFile(f);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }

        return zip.getEntry("manifest.json") != null && zip.getEntry("modlist.html") != null;
    }

    public List<CurseFile> getModFiles(int modid, IProperty<?>... properties) {
        return requestHandler.handleModFiles(modid, properties).getData();
    }

    @Override
    public List<CurseFile> getFiles(GetModFilesRequestBody body) {
        return requestHandler.handleFiles(body).getData();
    }

    @Override
    public String getModFileChangelog(int modId, int fileId) {
        return requestHandler.handleModFileChangelog(modId, fileId).getData();
    }

    @Override
    public String getModFileDownloadUrl(int modId, int fileId) {
        return requestHandler.handleModFileDownloadUrl(modId, fileId).getData();
    }

    @Override
    public FingerprintsMatchesResult getFingerprintMatchesResult(GetFingerprintMatchesRequestBody body) {
        return requestHandler.handleFingerprintsMatches(body).getData();
    }

    @Override
    public FingerprintFuzzyMatchResult getFingerprintFuzzyMatchResult(GetFuzzyMatchesRequestBody body) {
        return requestHandler.handleFingerprintsFuzzyMatches(body).getData();
    }

    @Override
    public List<MinecraftGameVersion> getMinecraftVersions(IProperty<?>... properties) {
        return requestHandler.handleMinecraftVersions(properties).getData();
    }

    @Override
    public MinecraftGameVersion getMinecraftGameVersion(String gameVersion, IProperty<?>... properties) {
        return requestHandler.handleGameVersion(gameVersion, properties).getData();
    }

    @Override
    public List<MinecratModLoaderIndex> getMinecraftModLoaders(IProperty<?>... properties) {
        return requestHandler.handleMinecraftModLoaders(properties).getData();
    }

    @Override
    public MinecraftModLoaderVersion getMinecraftModLoaderVersion(String modLoaderName, IProperty<?>... properties) {
        return requestHandler.handleModLoader(modLoaderName, properties).getData();
    }

    @Override
    public GetFeaturedModsResponse getFeaturedMods(GetFeaturedModsRequestBody body) {
        return requestHandler.handleFeaturedMods(body);
    }

    @Override
    public String getDescriptionMod(int modId, IProperty<?>... properties) {
        return requestHandler.handleModDescription(modId, properties).getData();
    }

    @Override
    public CurseFile getModFile(int modId, int fileId, IProperty<?>... properties) {
        return requestHandler.handleModFile(modId, fileId, properties).getData();
    }

    @Override
    public List<Game> getGames(IProperty<?>... properties) {
        return requestHandler.handleGetGames(properties).getData();
    }

    @Override
    public Game getGame(int gameId, IProperty<?>... properties) {
        return requestHandler.handleGetGame(gameId, properties).getData();
    }

    @Override
    public List<GameVersionsByType> getGameVersions(int gameId, IProperty<?>... properties) {
        return requestHandler.handleGetGameVersions(gameId, properties).getData();
    }

    @Override
    public List<GameVersionType> getGameVersionTypes(int gameId, IProperty<?>... properties) {
        return requestHandler.handleGetGameVersionTypes(gameId, properties).getData();
    }

    @Override
    public List<Category> getCategories(IProperty<?>... properties) {
        return requestHandler.handleGetCategories(properties).getData();
    }

    @Override
    public List<Mod> searchMods(IProperty<?>... properties) {
        return requestHandler.handleSearchMods(properties).getData();
    }

    @Override
    public Mod getMod(int modId, IProperty<?>... properties) {
        return requestHandler.handleGetMod(modId, properties).getData();
    }

    @Override
    public List<Mod> getMods(GetModsByIdsListRequestBody body) {
        return requestHandler.handleGetMods(body).getData();
    }

}
