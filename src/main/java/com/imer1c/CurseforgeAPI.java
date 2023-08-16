package com.imer1c;

import com.imer1c.profile.CurseforgeProfile;
import com.imer1c.properties.IProperty;
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

import java.io.File;
import java.util.List;
import java.util.zip.ZipFile;

public interface CurseforgeAPI {
    static CurseforgeAPI init(String apiKey) {
        return CurseforgeAPIProvider.init(apiKey);
    }

    CurseforgeProfile decryptProfile(ZipFile f);

    boolean isCurseForgeZip(File f);

    List<Game> getGames(IProperty<?>... properties);

    Game getGame(int gameId, IProperty<?>... properties);

    List<GameVersionsByType> getGameVersions(int gameId, IProperty<?>... properties);

    List<GameVersionType> getGameVersionTypes(int gameId, IProperty<?>... properties);

    List<Category> getCategories(IProperty<?>... properties);

    List<Mod> searchMods(IProperty<?>... properties);

    Mod getMod(int modId, IProperty<?>... properties);

    List<Mod> getMods(GetModsByIdsListRequestBody body);

    GetFeaturedModsResponse getFeaturedMods(GetFeaturedModsRequestBody body);

    String getDescriptionMod(int modId, IProperty<?>... properties);

    CurseFile getModFile(int modId, int fileId, IProperty<?>... properties);

    List<CurseFile> getModFiles(int modid, IProperty<?>... properties);

    List<CurseFile> getFiles(GetModFilesRequestBody body);

    String getModFileChangelog(int modId, int fileId);

    String getModFileDownloadUrl(int modId, int fileId);

    FingerprintsMatchesResult getFingerprintMatchesResult(GetFingerprintMatchesRequestBody body);

    FingerprintFuzzyMatchResult getFingerprintFuzzyMatchResult(GetFuzzyMatchesRequestBody body);

    List<MinecraftGameVersion> getMinecraftVersions(IProperty<?>... properties);

    MinecraftGameVersion getMinecraftGameVersion(String gameVersion, IProperty<?>... properties);

    List<MinecratModLoaderIndex> getMinecraftModLoaders(IProperty<?>... properties);

    MinecraftModLoaderVersion getMinecraftModLoaderVersion(String modLoaderName, IProperty<?>... properties);

}
