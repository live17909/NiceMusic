package com.lzx.nicemusic.module.songlist.presenter;

import com.lzx.musiclibrary.aidl.model.SongInfo;
import com.lzx.nicemusic.base.mvp.BaseContract;

import java.util.List;

/**
 * @author lzx
 * @date 2018/2/5
 */

public interface SongListContract {

    interface View extends BaseContract.BaseView {
        void onGetSongListSuccess(List<SongInfo> list);

        void loadMoreSongListSuccess(List<SongInfo> list);

        void loadFinishAllData();
    }

    interface Presenter<T> extends BaseContract.BasePresenter<T> {
        void requestSongList(String title);

        void loadMoreSongList(String title);

        int getAlbumCover(String title);
    }

}
