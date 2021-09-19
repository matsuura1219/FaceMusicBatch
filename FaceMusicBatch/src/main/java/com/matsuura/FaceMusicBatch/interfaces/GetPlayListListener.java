package com.matsuura.FaceMusicBatch.interfaces;

import java.util.ArrayList;

public interface GetPlayListListener {

	/** API呼び出し成功時に実行される関数です **/

	public void onSuccess(ArrayList<String> list);

	/** API呼び出し失敗時に実行される **/

	public void onFailure (String errorCode);

}
