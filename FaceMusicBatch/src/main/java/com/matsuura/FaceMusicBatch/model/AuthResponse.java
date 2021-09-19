package com.matsuura.FaceMusicBatch.model;

/** アクセストークン取得時のデータクラスです **/

public class AuthResponse {

	/** メンバー変数 **/

	// アクセストークン
	private String access_token;
	// 認証方式
	private String token_type;
	// 有効期限
	private int expires_in;

	/** Setter / Getter **/

	public String getAccess_token() {
		return access_token;
	}


	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}


	public String getToken_type() {
		return token_type;
	}


	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}


	public int getExpires_in() {
		return expires_in;
	}


	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}


}
