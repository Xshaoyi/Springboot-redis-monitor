package yi.shao.springbootDemo.modal;

import org.springframework.data.redis.connection.RedisServer;

public class RedisSentinelClient {
	private String name;
	private String ip;
	private int port;
	private String runid;
	private String flag;
	private Long pending_commands;
	private Long last_ping_sent;
	private Long last_ok_ping_reply;
	private Long down_after_milliseconds;
	private Long info_refresh;
	private String role_reported;
	private Long role_reported_time;
	private Long config_epoch;
	private Long num_slaves;
	//NUMBER_OTHER_SENTINELS
	private Long numberOtherSentinels;
	//BUFFER_LENGTH
	private Long qbuf;
	//BUFFER_FREE_SPACE
	private Long qbuf_free;
	//OUTPUT_BUFFER_LENGTH
	private Long obl;
	//QUORUM
	private Long quorum;
	
	private Long failover_timeout;
	
	private Long parallel_syncs;
	
	
	public String getRunid() {
		return runid;
	}
	public void setRunid(String runid) {
		this.runid = runid;
	}
	public Long getPending_commands() {
		return pending_commands;
	}
	public void setPending_commands(Long pending_commands) {
		this.pending_commands = pending_commands;
	}
	public String getRole_reported() {
		return role_reported;
	}
	public void setRole_reported(String role_reported) {
		this.role_reported = role_reported;
	}
	public Long getRole_reported_time() {
		return role_reported_time;
	}
	public void setRole_reported_time(Long role_reported_time) {
		this.role_reported_time = role_reported_time;
	}
	public Long getQbuf() {
		return qbuf;
	}
	public void setQbuf(Long qbuf) {
		this.qbuf = qbuf;
	}
	public Long getQbuf_free() {
		return qbuf_free;
	}
	public void setQbuf_free(Long qbuf_free) {
		this.qbuf_free = qbuf_free;
	}
	public Long getQuorum() {
		return quorum;
	}
	public void setQuorum(Long quorum) {
		this.quorum = quorum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Long getLast_ping_sent() {
		return last_ping_sent;
	}
	public void setLast_ping_sent(Long last_ping_sent) {
		this.last_ping_sent = last_ping_sent;
	}
	public Long getLast_ok_ping_reply() {
		return last_ok_ping_reply;
	}
	public void setLast_ok_ping_reply(Long last_ok_ping_reply) {
		this.last_ok_ping_reply = last_ok_ping_reply;
	}
	public Long getDown_after_milliseconds() {
		return down_after_milliseconds;
	}
	public void setDown_after_milliseconds(Long down_after_milliseconds) {
		this.down_after_milliseconds = down_after_milliseconds;
	}
	public Long getInfo_refresh() {
		return info_refresh;
	}
	public void setInfo_refresh(Long info_refresh) {
		this.info_refresh = info_refresh;
	}
	public Long getConfig_epoch() {
		return config_epoch;
	}
	public void setConfig_epoch(Long config_epoch) {
		this.config_epoch = config_epoch;
	}
	public Long getNum_slaves() {
		return num_slaves;
	}
	public void setNum_slaves(Long num_slaves) {
		this.num_slaves = num_slaves;
	}
	public Long getNumberOtherSentinels() {
		return numberOtherSentinels;
	}
	public void setNumberOtherSentinels(Long multi) {
		this.numberOtherSentinels = multi;
	}
	public Long getObl() {
		return obl;
	}
	public void setObl(Long obl) {
		this.obl = obl;
	}
	public Long getFailover_timeout() {
		return failover_timeout;
	}
	public void setFailover_timeout(Long failover_timeout) {
		this.failover_timeout = failover_timeout;
	}
	public Long getParallel_syncs() {
		return parallel_syncs;
	}
	public void setParallel_syncs(Long parallel_syncs) {
		this.parallel_syncs = parallel_syncs;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public RedisSentinelClient(String ip, int port) {
		super();
		this.ip = ip;
		this.port = port;
	}
	public RedisSentinelClient(RedisServer redisServer){
		setConfig_epoch(redisServer.getConfigEpoch());
		setDown_after_milliseconds(redisServer.getDownAfterMilliseconds());
		setFailover_timeout(redisServer.getFailoverTimeout());
		setFlag(redisServer.getFlags());
		setInfo_refresh(redisServer.getInfoRefresh());
		setIp(redisServer.getHost());
		setLast_ok_ping_reply(redisServer.getLastOkPingReply());
		setLast_ping_sent(redisServer.getLastPingSent());
		setNumberOtherSentinels(redisServer.getNumberOtherSentinels());
		setName(redisServer.getName());
		setNum_slaves(redisServer.getNumberSlaves());
		setParallel_syncs(redisServer.getParallelSyncs());
		setPending_commands(redisServer.getPendingCommands());
		setPort(redisServer.getPort());
		setQuorum(redisServer.getQuorum());
		setRole_reported(redisServer.getRoleReported());
		setRole_reported_time(redisServer.roleReportedTime());
		setRunid(redisServer.getRunId());
	}
}
