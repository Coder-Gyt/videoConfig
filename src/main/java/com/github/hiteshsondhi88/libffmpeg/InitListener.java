package com.github.hiteshsondhi88.libffmpeg;

public interface InitListener {
    public void onLoadSuccess();
    public void onLoadFail(String reason);
}
