### problem background
1. Key words
  * service location discovery
  * load balance and failover

### some domain entity
1. Application:应用
2. Instance:实例
2. Lease:租约
3. Client
4. Server

### use case

### CAP?
* AP

### architecture

### interface design
1. client
  * getApplicationByXXX
  * getInstanceByXXX
  * getZone
  * registryInstanceAndApplication
2. server
  * 

### client registration

### service discovery

### thread model 
1. DiscoveryClient-HeartbeatExecutor-0
2. DiscoveryClient-CacheRefreshExecutor-0
3. Eureka-CacheFillTimer
4. Eureka-PeerNodesUpdater
5. TaskNonBatchingWorker-localhost-0
6. TaskAcceptor-localhost
7. TaskBatchingWorker-target_localhost-[0-19]
8. StatsMonitor-0
9. TaskAcceptor-target_localhost
10. Eureka-JerseyClient-Conn-Cleaner2
11. Eureka-MeasureRateTimer
12. ReplicaAwareInstanceRegistry - RenewalThresholdUpdater  TimerThread
13. Eureka-MeasureRateTimer
14. Eureka-EvictionTimer
15. Eureka-DeltaRetentionTimer
16. DiscoveryClient-InstanceInfoReplicator-0
17. DiscoveryClient-[0-1]
18. AsyncResolver-bootstrap-0

### important flow chart

### deployment in different enviroments

